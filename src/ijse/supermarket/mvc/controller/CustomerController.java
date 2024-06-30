/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ijse.supermarket.mvc.controller;

import ijse.supermarket.mvc.dto.CustomerDto;
import ijse.supermarket.mvc.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CustomerController {
    private CustomerModel customerModel;
    
    public CustomerController(){
        customerModel = new CustomerModel();
        
    }    
    
    public String saveCustomer(CustomerDto customerdto) throws ClassNotFoundException, SQLException{
        return customerModel.saveCustomer(customerdto);
        
    }
    
    public ArrayList<CustomerDto> getAllCustomer() throws Exception{
        return customerModel.getAllCustomer();
    
    }
}
