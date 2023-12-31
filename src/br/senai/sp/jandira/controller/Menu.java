package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Produto;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    ClienteController cliente = new ClienteController();
    ProdutoController produto = new ProdutoController();



    public void executarMenu() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar){
            System.out.println("+ -- =0=0= -- =0=0= -- =0=0= -- =0=0= -- +");
            System.out.println("|                                        |");
            System.out.println("| --   Gerenciamento Estoque Rocha    -- |");
            System.out.println("|                                        |");
            System.out.println("+ -- =0=0= -- =0=0= -- =0=0= -- =0=0= -- +");
            System.out.println("| 1 - Cadastrar Cliente                  |");
            System.out.println("| 2 - Listar Clientes                    |");
            System.out.println("| 3 - Atualizar Cliente                  |");
            System.out.println("| 4 - Deletar Cliente                    |");
            System.out.println("| 5 - Cadastrar Produto                  |");
            System.out.println("| 6 - Listar Produtos                    |");
            System.out.println("| 7 - Deletar Produto                    |");
            System.out.println("| 8 - Atualizar Produto                  |");
            System.out.println("| 9  - Sair                              |\n");

            System.out.println("<|><|><|>   Escolha uma opção   <|><|><|> ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    Cliente newCliente = new Cliente();
                    newCliente.cadastrarCliente();
                    cliente.registarCliente(newCliente);


                    break;

                case 2:
                    System.out.println("=0=0= -- Lista de Clientes -- =0=0=");
                    cliente.listarClientes();

                    break;

                case 3:
                    System.out.println("Informe o cliente que deseja atualizar: ");
                    String nomeClienteUpdate = scanner.nextLine();
                    System.out.println("Informe o novo ID para " + nomeClienteUpdate);
                    String telefoneNome = scanner.nextLine();
                    cliente.atualizarCliente(nomeClienteUpdate, telefoneNome);

                    break;

                case 4:
                    System.out.println("Qual cpf deseja excluir: ");
                    long cpfDelete = scanner.nextLong();
                    cliente.deletarCliente(cpfDelete);
                    break;

                case 5:
                    Produto newProduto = new Produto();
                    newProduto.cadastrarProduto();
                    produto.registrarProduto(newProduto);

                    break;

                case 6:
                    System.out.println("=0=0= -- Listar Produtos -- =0=0=");
                    produto.listarProdutos();
                    break;

                case 7:
                    System.out.println("Qual produto deseja excluir: ");
                    String produtoDelete = scanner.nextLine();
                    produto.deletarProduto(produtoDelete );
                    break;

                case 8:
                    System.out.println("Informe o produto para ser atualizado: ");
                    String nomeUpdate = scanner.nextLine();
                    System.out.println("Informe o novo ID para " + nomeUpdate);
                    int idProduto = scanner.nextInt();
                    produto.atualizarProduto(nomeUpdate, idProduto);

                    break;

                case 9:
                    continuar = false;
                    break;
            }

        }
    }


}
