/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehedi
 */
public class pro_t {
    
    
    
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehedi
 */
    private int priice;
    private String firstName;
    private String lastName;
   
    
    
        
    public pro_t( String Fname,int price, String Lname)
    {
        
        this.firstName = Fname;
        this.priice=  price; 
        this.lastName = Lname;
       
    }
    
        public int getpriice()
    {
        return priice;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastNAme()
    {
        return lastName;
    }
    
   
    
}
    

