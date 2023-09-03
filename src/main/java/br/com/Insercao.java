package br.com;

import java.sql.*;

public class Insercao {
    public static void main(String[] args) throws SQLException {

        String nome = "TESTE";
        String descricao = "TESTE";

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperaConexao();

        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO PRODUTO(nome, descricao) VALUES (?,?)",Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, nome);
        preparedStatement.setString(2, descricao);

        preparedStatement.execute();

        ResultSet rset = preparedStatement.getGeneratedKeys();

        while (rset.next()){
            Integer id = rset.getInt(1);
            System.out.println("ID criado: " + id);
        }
    }
}
