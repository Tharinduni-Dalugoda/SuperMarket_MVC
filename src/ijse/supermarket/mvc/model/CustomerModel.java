/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ijse.supermarket.mvc.model;


import java.sql.Connection;
import ijse.supermarket.mvc.db.DBconnection;
import ijse.supermarket.mvc.dto.CustomerDto;
import java.sql.SQLException;
import java.sql.PreparedStatement;


/**
 *
 * @author user
 */
public class CustomerModel {
    //save customer
    public String saveCustomer(CustomerDto customerDto) throws ClassNotFoundException, SQLException{
        Connection connection = DBconnection.getinstance().getConnection();
        
        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1,customerDto.getCustID());
        statement.setString(2,customerDto.getCustName());
        statement.setString(3,customerDto.getDOB());
        statement.setString(4,customerDto.getAddress());
        statement.setInt(5,customerDto.getSalary());
        statement.setInt(6,customerDto.getTelNo());
        
        if(statement.executeUpdate()>0){
            return "Success";     
        }else{
            return "fail";
        }
        
                
        }
    
}
