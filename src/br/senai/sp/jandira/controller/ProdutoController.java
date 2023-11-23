package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;
import br.senai.sp.jandira.model.Produto;

import javax.sound.midi.spi.MidiDeviceProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoController {

    Conexao conexao = new Conexao();
    Connection objConection = conexao.getConection();

    public void registrarProduto(Produto newProduto) throws SQLException {
        Statement statement = objConection.createStatement();

        String queryRegistrar = "INSERT INTO produtos (idProduto, " +
                "nome, quantidadeEstoque, precoUnit, fornecedor) values (" +
                newProduto.getIdProduto() + ",'" + newProduto.getNomeProduto() +
                "','" + newProduto.getQuantidadeEstoque() + "','" + newProduto.getPrecoUnit() +
                "','" + newProduto.getFornecedor() + "')";

        statement.executeUpdate(queryRegistrar);
        System.out.println("Produto registrado com sucesso!");
    }

    public void listarProdutos() throws SQLException {
        Statement statement = objConection.createStatement();
        String queryConsulta = "SELECT * FROM produtos";
        ResultSet resultSet = statement.executeQuery(queryConsulta);
        Produto produto = new Produto();


        while (resultSet.next()){
            produto.setIdProduto(resultSet.getInt("idProduto"));
            produto.setNomeProduto(resultSet.getString("nome"));
            produto.setQuantidadeEstoque(resultSet.getInt("quantidadeEstoque"));
            produto.setPrecoUnit(resultSet.getDouble("precoUnit"));
            produto.setFornecedor(resultSet.getString("fornecedor"));

            System.out.println(produto.getIdProduto());
            System.out.println(produto.getNomeProduto());
            System.out.println(produto.getQuantidadeEstoque());
            System.out.println(produto.getPrecoUnit());
            System.out.println(produto.getFornecedor());
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
        }
    }

    public void deletarProduto(String nome) throws SQLException {
        System.out.println("Excluir " + nome);
        Statement statement = objConection.createStatement();
        String queryDelete = "DELETE FROM produtos WHERE nome = '" + nome + "'";

        try{
            statement.executeUpdate(queryDelete);
            System.out.println("Produto " + nome + " excluido com sucesso!");

        }catch (Exception error){
            System.out.println(error);
        }

    }

    public void consultarProduto(String nome) throws SQLException {
        Statement statement = objConection.createStatement();
        String queryPesquisa = "SELECT * FROM produtos WHERE nome = '" + nome + "'";
        ResultSet resultSet = statement.executeQuery(queryPesquisa);
        Produto produto = new Produto();

        while (resultSet.next()){
            produto.setIdProduto(resultSet.getInt("idProduto"));
            produto.setNomeProduto(resultSet.getString("nome"));
            produto.setQuantidadeEstoque(resultSet.getInt("quantidadeEstoque"));
            produto.setPrecoUnit(resultSet.getDouble("precoUnit"));
            produto.setFornecedor(resultSet.getString("fornecedor"));

            System.out.println(produto.getIdProduto());
            System.out.println(produto.getNomeProduto());
            System.out.println(produto.getQuantidadeEstoque());
            System.out.println(produto.getPrecoUnit());
            System.out.println(produto.getFornecedor());
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

        }

    }

    public void atualizarProduto(String nome, int idProduto) throws SQLException {
        Statement statement = objConection.createStatement();

        String queryAtualizar = "UPDATE produtos SET nome = '" + nome + "' WHERE idProduto = " + idProduto;

        statement.executeUpdate(queryAtualizar);
        System.out.println("Informações do produto alteradas com sucesso!");

    }
}
