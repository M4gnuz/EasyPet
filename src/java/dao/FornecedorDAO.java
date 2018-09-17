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
            String sql = "INSERT INTO tb_fornecedor (nome, cnpj, email, razao, senha, endereco, numero_rua, bairro,"
                    + "cidade, complemento, cep, data_abertura, telefone)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getNome()+ "");
            ps.setString(2, fornecedor.getCnpj());
            ps.setString(4, fornecedor.getRazao()+ "");
            ps.setString(5, fornecedor.getSenha()+"");
            ps.setString(6, fornecedor.getEndereco()+"");
            ps.setString(7, fornecedor.getNrRua()+"");
            ps.setString(8, fornecedor.getBairro()+"");
            ps.setString(9, fornecedor.getCidade()+"");
            ps.setString(10, fornecedor.getComplemento()+"");
            ps.setString(11,fornecedor.getCep());
            ps.setString(12, fornecedor.getDataAbertura()+"");
            ps.setString(13, fornecedor.getTelefone()+""); 
            ps.setString(3, fornecedor.getEmail()+"");
            ps.execute();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void alterarFornecedor(Fornecedor fornecedor){
        try {
            Connection con = Conecta.getConexao();
            String sql = "UPDATE tb_fornecedor SET nome=?, razao=?, senha=?, endereco=?, numero_rua=?, bairro=?,"
                    + "cidade=?, complemento=?, cep=?, telefone=? WHERE id_fornecedor=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getNome()+ "");
            ps.setString(2, fornecedor.getRazao()+ "");
            ps.setString(3, fornecedor.getSenha()+"");
            ps.setString(4, fornecedor.getEndereco()+"");
            ps.setString(5, fornecedor.getNrRua()+"");
            ps.setString(6, fornecedor.getBairro()+"");
            ps.setString(7, fornecedor.getCidade()+"");
            ps.setString(8, fornecedor.getComplemento()+"");
            ps.setString(9,fornecedor.getCep());
            ps.setString(10, fornecedor.getTelefone()+""); 
            ps.setInt(11, fornecedor.getId());
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
                novo.setCnpj(rs.getString("cnpj"));
                novo.setRazao(rs.getString("razao"));
                novo.setSenha(rs.getString("senha"));
                novo.setEndereco(rs.getString("endereco"));
                novo.setNrRua(rs.getString("numero_rua"));
                novo.setBairro(rs.getString("bairro"));
                novo.setCidade(rs.getString("cidade"));
                novo.setComplemento(rs.getString("complemento"));
                novo.setCep(rs.getString("cep"));
                novo.setDataAbertura(rs.getString("data_abertura"));
                novo.setTelefone(rs.getString("telefone"));
                novo.setEmail(rs.getString("email"));
                novo.setId(rs.getInt("id_fornecedor"));
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
    
    public static boolean confereEmail(Fornecedor fornecedor) {
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM  tb_fornecedor WHERE email= ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getEmail() + "");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            rs.close();
            ps.close();
            con.close();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean confereCNPJ(Fornecedor fornecedor) {
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM  tb_fornecedor WHERE cnpj= ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getCnpj()+ "");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            rs.close();
            ps.close();
            con.close();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static Fornecedor getFornecedor(int id){
        Fornecedor novo = new Fornecedor();
        try{
            Connection con = Conecta.getConexao();
            String sql;
            sql = "SELECT * FROM tb_fornecedor WHERE id_fornecedor = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                novo.setNome(rs.getString("nome"));
                novo.setCnpj(rs.getString("cnpj"));
                novo.setRazao(rs.getString("razao"));
                novo.setSenha(rs.getString("senha"));
                novo.setEndereco(rs.getString("endereco"));
                novo.setNrRua(rs.getString("numero_rua"));
                novo.setBairro(rs.getString("bairro"));
                novo.setCidade(rs.getString("cidade"));
                novo.setComplemento(rs.getString("complemento"));
                novo.setCep(rs.getString("cep"));
                novo.setDataAbertura(rs.getString("data_abertura"));
                novo.setTelefone(rs.getString("telefone"));
                novo.setEmail(rs.getString("email"));  
                novo.setId(rs.getInt("id_fornecedor"));
            }
            rs.close();
            ps.close();
            con.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();            
            return novo;
        }
      return novo;
    }
    
    public static Fornecedor ComparaFornecedor(Fornecedor fornecedor){
        Fornecedor novo = new Fornecedor();
        try{
            Connection con = Conecta.getConexao();
            String sql;
            sql = "SELECT * FROM tb_fornecedor";
            PreparedStatement ps = con.prepareStatement(sql);           
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                novo.setNome(rs.getString("nome"));
                novo.setCnpj(rs.getString("cnpj"));
                novo.setRazao(rs.getString("razao"));
                novo.setSenha(rs.getString("senha"));
                novo.setEndereco(rs.getString("endereco"));
                novo.setNrRua(rs.getString("numero_rua"));
                novo.setBairro(rs.getString("bairro"));
                novo.setCidade(rs.getString("cidade"));
                novo.setComplemento(rs.getString("complemento"));
                novo.setCep(rs.getString("cep"));
                novo.setDataAbertura(rs.getString("data_abertura"));
                novo.setTelefone(rs.getString("telefone"));
                novo.setEmail(rs.getString("email"));  
                novo.setId(rs.getInt("id_fornecedor"));
            }
            rs.close();
            ps.close();
            con.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();            
            return novo;
        }
      return novo;
    }
    
}
