/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import classes.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Luis Ragazzi
 */
public class ProdutoDAO {
    public static void addProduto(Produto produto, int id) {          
   
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO tb_produtos (id_fornecedor, imagem, nome, descricao, contra_indicacao, estoque,"
                    + " valor, categoria) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setBytes(2, produto.getImagem());
            ps.setString(3, produto.getNome());
            ps.setString(4, produto.getDescricao());
            ps.setString(5, produto.getContraIndicacao());
            ps.setFloat(7, produto.getPreco());
            ps.setInt(6, produto.getEstoque());
            ps.setString(8, produto.getCategoria()+"");           
            ps.execute();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
