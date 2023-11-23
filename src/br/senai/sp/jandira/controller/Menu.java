package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;

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
            System.out.println("| 4 - Cadastrar Produto                  |");
            System.out.println("| 5 - Listar Produtos                    |");
            System.out.println("| 6 - Deletar Produto                    |");
            System.out.println("|   - Sair                               |");

            System.out.println("| Escolha uma opção :                    |");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    Cliente newCliente = new Cliente();
                    //newCliente.
                    cliente.registarCliente(newCliente);

                    break;

                case 2:
                    System.out.println("=0=0= -- Lista de Clientes -- =0=0=");
                    cliente.listarClientes();

                    break;
            }

        }
    }


}
