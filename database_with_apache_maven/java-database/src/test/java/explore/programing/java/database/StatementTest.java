package explore.programing.java.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StatementTest {

    @Test
    void testCreateStatement() throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        Statement statement = connection.createStatement();

        statement.close();

        connection.close();
    }

    @Test
    void testExecuteUpdate() throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        Statement statement = connection.createStatement();

        String sql = """
                INSERT INTO customers (id, name, email) VALUES
                ('jok','joko','joko@email.com')
                """;

//        Execute Update untuk INSERT, UPDATE, DELETE
        int update = statement.executeUpdate(sql);
        System.out.println(update);

        statement.close();
        connection.close();
    }

    @Test
    void testExcecuteQuery() throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();
        List<Customers> arr = new ArrayList();
        Customers cs;

        String sql = """
                SELECT * FROM customers
                """;

        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            cs = new Customers();
            cs.setId(resultSet.getString("id"));
            cs.setName(resultSet.getString("name"));
            cs.setEmail(resultSet.getString("email"));

            arr.add(cs);
        }

        for (Customers data: arr)
            System.out.println(data);


        resultSet.close();
        statement.close();
        connection.close();
    }
}
