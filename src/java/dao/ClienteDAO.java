/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author glima
 */
public class ClienteDAO {
    
             public static void addCliente(Cliente cliente) {          
   
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO tb_cliente (nome, sobrenome, cpf, email,"
                    + "dt_nascimento, senha, sexo, telefone, endereco, numero_rua, "
                    + "cidade, bairro, complemento, cep) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNome()+ "");
            ps.setString(2, cliente.getSobreNome()+ "");
            ps.setString(3, cliente.getCpf());
            ps.setString(4, cliente.getEmail()+"");
            ps.setString(5, cliente.getDtNascimento()+"");
            ps.setString(6, cliente.getSenha()+"");
            ps.setString(7, cliente.getSexo()+"");
            ps.setString(8, cliente.getTelefone()+"");
            ps.setString(9, cliente.getEndereco()+"");
            ps.setString(10, cliente.getNrRua()+"");
            ps.setString(11, cliente.getCidade()+"");
            ps.setString(12, cliente.getBairro()+"");
            ps.setString(13, cliente.getComplemento()+"");
            ps.setString(14, cliente.getCep());
            ps.execute();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
             
     public static Cliente loginCliente(String email, String senha){
        Cliente novo = new Cliente();
        try{
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM  tb_cliente WHERE email= ? AND senha=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email+"");
            ps.setString(2, senha+"");            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                novo.setNome(rs.getString("nome"));
                novo.setSobreNome(rs.getString("sobrenome"));
                novo.setCpf(rs.getString("cpf"));
                novo.setEmail(rs.getString("email"));
                novo.setDtNascimento(rs.getString("dt_nascimento"));
                novo.setSenha(rs.getString("senha"));
                novo.setSexo(rs.getString("sexo").charAt(0));
                novo.setTelefone(rs.getString("telefone"));
                novo.setEndereco(rs.getString("endereco"));
                novo.setNrRua(rs.getString("numero_rua"));
                novo.setCidade(rs.getString("cidade"));
                novo.setBairro(rs.getString("bairro"));
                novo.setComplemento(rs.getString("complemento"));
                novo.setCep(rs.getString("cep"));
            } 
            rs.close();
            ps.close();
            con.close();
            return novo;
        }
        catch(Exception e){
            e.printStackTrace();            
            return novo;
        }
        
    }
     
     public static Cliente getCliente(Cliente cliente){
        Cliente novo = new Cliente();
        try{
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM  tb_cliente";
            PreparedStatement ps = con.prepareStatement(sql);                    
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                novo.setNome(rs.getString("nome"));
                novo.setSobreNome(rs.getString("sobrenome"));
                novo.setCpf(rs.getString("cpf"));
                novo.setEmail(rs.getString("email"));
                novo.setDtNascimento(rs.getString("dt_nascimento"));
                novo.setSenha(rs.getString("senha"));
                novo.setSexo(rs.getString("sexo").charAt(0));
                novo.setTelefone(rs.getString("telefone"));
                novo.setEndereco(rs.getString("endereco"));
                novo.setNrRua(rs.getString("numero_rua"));
                novo.setCidade(rs.getString("cidade"));
                novo.setBairro(rs.getString("bairro"));
                novo.setComplemento(rs.getString("complemento"));
                novo.setCep(rs.getString("cep"));
            } 
            rs.close();
            ps.close();
            con.close();
            return novo;
        }
        catch(SQLException e){
            e.printStackTrace();            
            return novo;
        }
        
    }
}

    
