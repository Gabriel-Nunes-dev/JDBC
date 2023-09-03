package br.com;

import java.sql.*;

public class Listagem {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperaConexao();

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
        preparedStatement.execute();

        ResultSet rset = preparedStatement.getResultSet();

        while (rset.next()){
            Integer id = rset.getInt("ID");
            System.out.println(id);
            String nome = rset.getString("NOME");
            System.out.println(nome);
            String descricao = rset.getString("DESCRICAO");
            System.out.println(descricao);
            System.out.println("==============================================");
        }

        connection.close();
    }
}
