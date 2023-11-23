package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Produto {

    Scanner scanner = new Scanner(System.in);

    private String nomeProduto, fornecedor;
    private int codigo, quantidadeEstoque, idProduto;
    private  double precoUnit;

    public void cadastrarProduto(){

        System.out.println("+ -- =0=0= -- =0=0= -- =0=0= -- +");
        System.out.println("| --  Cadastro de Produtos   -- |");
        System.out.println("| -- =0=0= -- =0=0= -- =0=0= -- |");

        System.out.println("ID do Produto: ");
        this.idProduto = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nome do Produto: ");
        this.nomeProduto = scanner.nextLine();
        System.out.println("Quantidade: ");
        this.quantidadeEstoque = scanner.nextInt();
        System.out.println("Preço Unit: ");
        this.precoUnit = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Fornecedor: ");
        this.fornecedor = scanner.nextLine();


    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }
}
