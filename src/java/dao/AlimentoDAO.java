/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Alimento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Luis Ragazzi
 */
public class AlimentoDAO {
    public static void addAlimento(Alimento alimento, int id) {          
   
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO tb_produtos(id_fornecedor, imagem, nome, descricao, contra_indicacao, estoque,"
                    + " valor, categoria, ingredientes, quantidade, validade) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, id);
            ps.setBytes(2, alimento.getImagem());
            ps.setString(3, alimento.getNome());
            ps.setString(4, alimento.getDescricao());
            ps.setString(5, alimento.getContraIndicacao());
            ps.setFloat(7, alimento.getPreco());
            ps.setInt(6, alimento.getEstoque());
            ps.setString(8, alimento.getCategoria()+"");
            ps.setString(9, alimento.getNomeIngrediente()+"");
            ps.setInt(10, alimento.getQtdIngrediente());
            ps.setString(11, alimento.getDtVencimento()+"");
            ps.execute();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
