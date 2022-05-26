package explore.programing.java.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

/**
 *  Kalo untuk di main atau bukan ditest pakai script yang ini
 *  kalau berada di test bisa pakai fungsi yang ada dibawah static
 *  */
//    static{
//        try{
//            Driver mysqliDriver = new com.mysql.jdbc.Driver();
//            DriverManager.registerDriver(mysqliDriver);
//        }catch(SQLException exceptions){
//            exceptions.printStackTrace();
//        }
//    }

    @BeforeAll
    static void beforeAll()
    {
        try{
            Driver mysqliDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mysqliDriver);
        }catch(SQLException exceptions){
            exceptions.printStackTrace();
        }
    }


    @Test
    void testConnection()
    {
        String jdbcUrl = "jdbc:mysql://localhost:3306/java_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "";

        try{
            Connection connect = DriverManager.getConnection(jdbcUrl, username, password);

            System.out.println("Sukses Konek DB");

        }catch (SQLException exception){
            Assertions.fail(exception);
        }
    }

    @Test
    void testConnectionClose()
    {
        String jdbcUrl = "jdbc:mysql://localhost:3306/java_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "";

//      Cara manual close db
//        try{
//            Connection connect = DriverManager.getConnection(jdbcUrl, username, password);
//
//            System.out.println("Sukses Konek DB");
//
//            connect.close();
//
//            System.out.println("Sukses tutup koneksi DB");
//        }catch (SQLException exception){
//            Assertions.fail(exception);
//        }


//        Otomatis dari java pakai trycatch untuk close db
        try (Connection connect = DriverManager.getConnection(jdbcUrl, username, password)){
            System.out.println("Sukses Konek DB");
        }catch (SQLException exception){
            Assertions.fail(exception);
        }
    }
}
