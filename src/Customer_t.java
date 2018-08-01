/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehedi
 */
public class Customer_t {
    private int id;
    private String firstName;
    private String lastName;
    private String mobile;
    private final String other_details;
    
    
        
    public Customer_t(int Id, String Fname, String Lname, String mobile,String other_details)
    {
        this.id = Id;
        this.firstName = Fname;
        this.lastName = Lname;
        this.mobile = mobile;
        this.other_details = other_details;
    }
    
        public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastNAme()
    {
        return lastName;
    }
    
    public String getmobile()
    {
        return mobile;
    }
    
    
    
     public String getother_details()
    {
        return other_details;
    }
    
    
    
}
