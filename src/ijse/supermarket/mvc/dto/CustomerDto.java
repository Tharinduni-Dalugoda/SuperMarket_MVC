/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ijse.supermarket.mvc.dto;

/**
 *
 * @author user
 */
public class CustomerDto {
    private String CustID;
    private String CustName;
    private String DOB;
    private String Address;
    private int Salary;
    private int TelNo;
       
    public void setCustID(String CustID){
        this.CustID = CustID;
    }
    
    public String getCustID(){
        return this.CustID;
    }

    /**
     * @return the CustName
     */
    public String getCustName() {
        return CustName;
    }

    /**
     * @param CustName the CustName to set
     */
    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Salary
     */
    public int getSalary() {
        return Salary;
    }

    /**
     * @param Salary the Salary to set
     */
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    /**
     * @return the TelNo
     */
    public int getTelNo() {
        return TelNo;
    }

    /**
     * @param TelNo the TelNo to set
     */
    public void setTelNo(int TelNo) {
        this.TelNo = TelNo;
    }
    
    
}
