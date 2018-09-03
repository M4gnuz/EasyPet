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
    public static void addAlimento(Alimento alimento) {          
   
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO tb_produtos(imagem, nome, descricao, contra_indicacao, estoque,"
                    + " valor, categoria, ingredientes, quantidade, validade) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setBytes(1, alimento.getImagem());
            ps.setString(2, alimento.getNome());
            ps.setString(3, alimento.getDescricao());
            ps.setString(4, alimento.getContraIndicacao());
            ps.setFloat(6, alimento.getPreco());
            ps.setInt(5, alimento.getEstoque());
            ps.setString(7, alimento.getCategoria()+"");
            ps.setString(8, alimento.getNomeIngrediente()+"");
            ps.setInt(9, alimento.getQtdIngrediente());
            ps.setString(10, alimento.getDtVencimento()+"");
            ps.execute();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
