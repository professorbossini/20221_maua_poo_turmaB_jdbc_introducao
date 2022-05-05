/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.bossini._maua_poo_turmab_jdbc_introducao;

/**
 *
 * @author rodri
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class App {

    public static void main(String[] args) throws Exception {
        Connection conexao;
        String usuario = "root";
        String senha = "1234";
        String host = "localhost";
        String port = "3306";
        String db = "20221_maua_poo_turmaB_pessoas";
        
        //string de conexão
        //jdbc:mysql://localhost:3306/20221_maua_poo_turmaB_pessoas
        String s = String.format(
            "jdbc:mysql://%s:%s/%s",
            host,
            port,
            db
        );
        conexao = DriverManager.getConnection(
            s,
            usuario,
            senha
        );
        if (conexao != null){
            System.out.println("Conexão OK");
        }
        else{
            System.out.println("Conexão NOK");
        }
    }
}
