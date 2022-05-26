package explore.programing.java.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPoolTest {

    @Test
    void testHikariCP()
    {
        HikariConfig config = new HikariConfig();

        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/java_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        config.setUsername("root");
        config.setPassword("");


        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60_000);
        config.setMaxLifetime(10 * 60_000);


        try{
            HikariDataSource dataSource = new HikariDataSource(config);
            Connection connect = dataSource.getConnection();
            connect.close();
            dataSource.close();
        }catch (SQLException exception){
            Assertions.fail(exception);
        }
    }

    @Test
    void testUtil() throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();
    }
}
