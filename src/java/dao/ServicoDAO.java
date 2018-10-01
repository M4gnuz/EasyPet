/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author glima
 */
public class ServicoDAO {
    public static void addServico(Servico servico, int id){
         try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO tb_servicos (id_fornecedor, porte, descricao, animal, preco,"
                    + " frete, categoria, tempo) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);            
            ps.setString(2, servico.getPorte());
            ps.setString(3, servico.getDescricao());
            ps.setString(4, servico.getAnimal());
            ps.setFloat(5, servico.getPreco());
            ps.setFloat(6, servico.getFrete());
            ps.setString(7, servico.getCategoria() + "");
            ps.setString(8, servico.getTempo()+ "");
            ps.execute();
            
            ResultSet rs = ps.getGeneratedKeys();
            servico.setId((rs.next())?rs.getInt(1):0);
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void getProdutos(List lista, int id) {

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM  tb_servicos WHERE id_fornecedor=? ORDER BY id_servico DESC";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id + "");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Servico servico = new Servico();
                servico.setPorte(rs.getString("porte"));
                servico.setDescricao(rs.getString("descricao"));
                servico.setAnimal(rs.getString("animal"));
                servico.setPreco(rs.getFloat("preco"));
                servico.setFrete(rs.getFloat("frete"));
                servico.setCategoria(rs.getString("categoria"));
                servico.setTempo(rs.getString("tempo"));
                servico.setIdFornecedor(rs.getInt("id_fornecedor"));

                lista.add(servico);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
