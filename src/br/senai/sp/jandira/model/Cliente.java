package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {

    Scanner scanner = new Scanner(System.in);

    private String nome, cpf, telefone;
    private int idCliente;

    private void cadastrarCliente(){

        System.out.println("+ -- =0=0= -- =0=0= -- =0=0= -- +");
        System.out.println("| --   Cadastro de Cliente   -- |");
        System.out.println("| -- =0=0= -- =0=0= -- =0=0= -- |");

        System.out.println("Nome no Cliente: ");
        this.nome = scanner.nextLine();
        System.out.println("CPF: ");
        this.cpf = scanner.nextLine();
        System.out.println("Telefone: ");
        this.telefone = scanner.nextLine();



    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
