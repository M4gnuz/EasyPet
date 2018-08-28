/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author glima
 */
public class FornecedorDAO {     
    
    public static void addFornecedor(Fornecedor fornecedor) {
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO tb_fornecedor VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getNome()+ "");
            ps.setLong(2, fornecedor.getCnpj());
            ps.setString(3, fornecedor.getRazao()+ "");
            ps.setString(4, fornecedor.getSenha()+"");
            ps.setString(5, fornecedor.getEndereco()+"");
            ps.setString(6, fornecedor.getNrRua()+"");
            ps.setString(7, fornecedor.getBairro()+"");
            ps.setString(8, fornecedor.getCidade()+"");
            ps.setString(9, fornecedor.getComplemento()+"");
            ps.setInt(10,fornecedor.getCep());
            ps.setString(11, fornecedor.getDataAbertura()+"");
            ps.setString(12, fornecedor.getTelefone()+""); 
            ps.setString(13, fornecedor.getEmail()+"");
            ps.execute();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Fornecedor loginFornecedor(String email, String senha){
        Fornecedor novo = new Fornecedor();
        try{
            Connection con = Conecta.getConexao();
            String sql;
            sql = "SELECT * FROM tb_fornecedor WHERE email=? and senha=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email+"");
            ps.setString(2, senha+"");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                novo.setNome(rs.getString("nome"));
                novo.setCnpj(rs.getLong("cnpj"));
                novo.setRazao(rs.getString("razao"));
                novo.setSenha(rs.getString("senha"));
                novo.setEndereco(rs.getString("endereco"));
                novo.setNrRua(rs.getString("numero_rua"));
                novo.setBairro(rs.getString("bairro"));
                novo.setCidade(rs.getString("cidade"));
                novo.setComplemento(rs.getString("complemento"));
                novo.setCep(rs.getInt("cep"));
                novo.setDataAbertura(rs.getString("data_abertura"));
                novo.setTelefone(rs.getString("telefone"));
                novo.setEmail(rs.getString("email"));               
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
    
    public static Fornecedor getFornecedor(Fornecedor fornecedor){
        Fornecedor novo = new Fornecedor();
        try{
            Connection con = Conecta.getConexao();
            String sql;
            sql = "SELECT * FROM tb_fornecedor";
            PreparedStatement ps = con.prepareStatement(sql);           
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                novo.setNome(rs.getString("nome"));
                novo.setCnpj(rs.getLong("cnpj"));
                novo.setRazao(rs.getString("razao"));
                novo.setSenha(rs.getString("senha"));
                novo.setEndereco(rs.getString("endereco"));
                novo.setNrRua(rs.getString("numero_rua"));
                novo.setBairro(rs.getString("bairro"));
                novo.setCidade(rs.getString("cidade"));
                novo.setComplemento(rs.getString("complemento"));
                novo.setCep(rs.getInt("cep"));
                novo.setDataAbertura(rs.getString("data_abertura"));
                novo.setTelefone(rs.getString("telefone"));
                novo.setEmail(rs.getString("email"));               
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
