/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._maua_poo_turmab_jdbc_introducao;

/**
 *
 * @author rodri
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Pessoa {
    
    private int codigo;
    private String nome;
    private String fone;
    private String email;

    public Pessoa(String nome, String fone, String email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }
    
        
    
    public void inserir(){
        
        //try/catch
        //jdbc:mysql://localhost:3306/nomeBanco?useTimeZone=true&serverTimezone=UTC
        //no suitable driver found
        
        try{
            String host = "localhost";
            String port = "3306";
            String db = "20221_maua_poo_turmaB_pessoas";
            Connection conexao = DriverManager.getConnection(
                String.format(
                    "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
                    host,
                    port,
                    db
                ),
                "root",
                "1234"//ECA302
            );
            String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES(?, ?, ?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            
            //executar
            ps.execute();
            
            ps.close();
            conexao.close();
            
            
        }
        catch(Exception e){
            System.out.printf("Exceção: %s\n", e.getMessage());
            System.out.println("Exceção: " + e.getMessage());
        }
        
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
