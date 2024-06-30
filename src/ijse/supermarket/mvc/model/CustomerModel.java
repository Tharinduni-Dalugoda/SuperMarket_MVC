/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ijse.supermarket.mvc.model;


import java.sql.Connection;
import ijse.supermarket.mvc.db.DBconnection;
import ijse.supermarket.mvc.dto.CustomerDto;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


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
                 
    };
    
    public ArrayList<CustomerDto> getAllCustomer() throws SQLException, ClassNotFoundException{
        
        Connection connection = DBconnection.getinstance().getConnection();
        String sql = "SELECT*FROM Customer";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();
        
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        
        while (rst.next()){
            CustomerDto dto = new CustomerDto();
            dto.setCustID(rst.getString("CustID"));
            dto.setCustName(rst.getString("CustName"));
            dto.setDOB(rst.getString("DOB"));
            dto.setAddress(rst.getString("Address"));
            dto.setSalary(rst.getInt("Salary"));
            
            customerDtos.add(dto);
        }
        
        return customerDtos;
        
    }
    
    public CustomerDto searchCustomer(String id) throws ClassNotFoundException, SQLException{
        Connection connection = DBconnection.getinstance().getConnection();
        
        String sql = "SELECT*FROM Customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
        
        ResultSet rst = statement.executeQuery();
        CustomerDto dto = null;
        while(rst.next()){
            dto = new CustomerDto ();
            dto.setCustID(rst.getString("CustID"));
            dto.setCustName(rst.getString("CustName"));
            dto.setDOB(rst.getString("DOB"));
            dto.setAddress(rst.getString("Address"));
            dto.setSalary(rst.getInt("Salary"));
                
        }
        return dto;
    }
    
    public String updateCustomer(CustomerDto customerDto) throws SQLException, ClassNotFoundException{
        Connection connection = DBconnection.getinstance().getConnection();
        
        String sql = "UPDATE Customer SET  CustName=?, DOB=?, Address=?, Salary=?, TelNo=? WHERE CustID=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1,customerDto.getCustName());
        statement.setString(2,customerDto.getDOB());
        statement.setString(3,customerDto.getAddress());
        statement.setInt(4,customerDto.getSalary());
        statement.setInt(5,customerDto.getTelNo());
       // statement.setString(6,customerDto.getCustID());
        statement.setString(6,customerDto.getCustID());
        
        if(statement.executeUpdate()>0){
            return "Success";     
        }else{
            return "fail";
        }
        
    }
    
    public String deleteCustomer(String id)throws Exception{
        Connection connection = DBconnection.getinstance().getConnection();
        
        String sql = "DELETE FROM Customer WHERE CustID=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setString(1,id);
        
        if(statement.executeUpdate()>0){
            return "Success";     
        }else{
            return "fail";
        }
        
    }
    }
}
