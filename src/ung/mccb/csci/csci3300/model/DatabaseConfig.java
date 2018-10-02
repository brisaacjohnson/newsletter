package ung.mccb.csci.csci3300.model;




import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost/subscriberdb";

    // connection  method that connects us to the MySQL database
    public static Connection getConnection() throws SQLException, IOException {
        System.out.println("Successfully subscribed to UNG Newsletter!");

        return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
    }

    // method that displays our errors in more detail if connection fails
    public static void displayException(SQLException ex){

        System.err.println("Error Message: " + ex.getMessage());
        System.err.println("Error Code: " + ex.getErrorCode());
        System.err.println("SQL Status: " + ex.getSQLState());

    }
}

