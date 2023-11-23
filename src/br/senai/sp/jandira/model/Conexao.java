package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private String server, database, user, password;

    public Connection conexao;

    public Conexao(){
        this.server = "localhost";
        this.database = "db_sge";
        this.user = "root";
        this.password = "bcd127";
    }

    public void connectDriver(){
        try{
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.server + "/" + this.database, this.user, this.password);
        } catch (SQLException error){
            System.out.println(error);
        }
    }
    public Connection getConection(){
        connectDriver();
        return conexao;
    }

}
