package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteController {

    Conexao conexao = new Conexao();
    Connection objConection = conexao.getConection();

    public void registarCliente(Cliente newCliente) throws SQLException {
        Statement statement = objConection.createStatement();

        String queryRegister = "INSERT INTO clientes (cpf, nome, telefone) values ('" +
                newCliente.getCpf() + "','" + newCliente.getNome() +
                "','" + newCliente.getTelefone() + "')";

        statement.executeUpdate(queryRegister);
        System.out.println("Customer registered successfully");
    }

    public void listCliente() throws SQLException {
        Statement statement = objConection.createStatement();

        String queryConsult = "SELECT * FROM clientes";
        ResultSet resultSet = statement.executeQuery(queryConsult);
        Cliente cliente = new Cliente();

        while (resultSet.next()) {
            cliente.setIdCliente(resultSet.getInt("idCliente"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.setCpf(resultSet.getString("cpf"));
            cliente.setTelefone(resultSet.getString("telefone"));

            System.out.println(cliente.getIdCliente());
            System.out.println(cliente.getNome());
            System.out.println(cliente.getCpf());
            System.out.println(cliente.getTelefone());
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

        }

    }

        public void consultarCliente(String cpf) throws SQLException {
            Statement statement = objConection.createStatement();
            String querySearch = "SELECT * FROM clientes WHERE cpf = '" + cpf + "'";
            ResultSet resultSet = statement.executeQuery(querySearch);
            Cliente cliente = new Cliente();

            while(resultSet.next()){
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setCpf(resultSet.getString("cpf"));
                cliente.setTelefone(resultSet.getString("telefone"));
                System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
            }
        }

        public void deleteCliente(String cpf) throws SQLException {
            System.out.println("Qual CPF deseja deletar: " + cpf);

            Statement statement = objConection.createStatement();

            String queryDelete = "DELETE FROM clientes WHERE cpf = '" + cpf + "'";

            try{
                statement.executeUpdate(queryDelete);
                System.out.println("Cliente de CPF " + cpf + " deletado com sucesso! ");
            } catch (Exception error){
                System.out.println(error);
            }
        }

        public void atualizarCliente(String cpf, String telefone) throws SQLException {
             Statement statement = objConection.createStatement();

             String queryEdit = "UPDATE clientes SET telefone = '" + telefone + "' WHERE cpf = '" + cpf + "'";

             statement.executeUpdate(queryEdit);
             System.out.println("Informações do cliente alteradas com sucesso!");
    }

}
