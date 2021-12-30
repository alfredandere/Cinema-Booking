/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaproject;

import java.sql.*;

/**
 *
 * @author cyril
 */
public class MyConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "");
            System.out.print("Connected To Database");
        } catch (Exception e) {
            System.out.println("Database connection error:   " + e.getMessage());
        }

        return con;
    }

    public static void main(String arg[]) {
        getConnection();
    }
}
