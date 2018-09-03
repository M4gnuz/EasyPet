package dao;

import java.sql.*;

public class Conecta {

    
    public static Connection getConexao() {
        Connection con = null;
        try {
            String serverName = "mysql05-farm76.kinghost.net";
            String mydatabase = "easypetg4";
            //String serverName = "localhost";
            //String mydatabase = "easypet";
            String username = "easypetg4";
            String password = "p68dd2mw";
            //String username = "root";
            //String password = "root";
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useSSL=false";
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado " + e.toString());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar o Banco de Dados " + e.toString());
        }
        return con;
    }
}
