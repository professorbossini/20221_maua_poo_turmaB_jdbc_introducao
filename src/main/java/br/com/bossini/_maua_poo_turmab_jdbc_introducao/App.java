/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.bossini._maua_poo_turmab_jdbc_introducao;

import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */

import javax.swing.JOptionPane;
public class App {

    public static void main(String[] args) throws Exception {
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(op){
                case 1:{
                    String nome = JOptionPane.showInputDialog("Digite o nome");
                    String fone = JOptionPane.showInputDialog("Digite o fone");
                    String email = JOptionPane.showInputDialog("Digite o e-mail");
                    Pessoa p = new Pessoa(nome, fone, email);
                    p.inserir();
                    JOptionPane.showMessageDialog(null, "Pessoa cadastrada");
                }                    
                break;
                case 2:{
                    String nome = JOptionPane.showInputDialog("Digite o nome");
                    break;
                }                    
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while(op != 0);
    }
}


//Connection conexao;
//        String usuario = "root";
//        String senha = "1234";//ECA302
//        String host = "localhost";
//        String port = "3306";
//        String db = "20221_maua_poo_turmaB_pessoas";
//        
//        //string de conexão
//        //jdbc:mysql://localhost:3306/20221_maua_poo_turmaB_pessoas
//        String s = String.format(
//            "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",
//            host,
//            port,
//            db
//        );
//        conexao = DriverManager.getConnection(
//            s,
//            usuario,
//            senha
//        );
//        if (conexao != null){
//            System.out.println("Conexão OK");
//        }
//        else{
//            System.out.println("Conexão NOK");
//        }
