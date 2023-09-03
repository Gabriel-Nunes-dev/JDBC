package br.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Remocao {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperaConexao();

        PreparedStatement preparedstatement = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID = 19");
        preparedstatement.execute();
        System.out.println("ID Deletado com sucesso!");
    }
}
