/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    
package ijse.supermarket.mvc.db;
//import com.sun.jdi.connect.spi.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */

public class DBconnection {
    private static DBconnection dbConnection;
    private final Connection connection;

    public DBconnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "newpassword") ;
    }


    public static DBconnection getinstance() throws ClassNotFoundException, SQLException{
        if(dbConnection == null){
            dbConnection = new DBconnection();
        } 
        return dbConnection;
    }

    public Connection getConnection(){
        return connection;
    }

}


