/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehedi
 */
public class sto_t {
    
    
    
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehedi
 */
    private int id;
    private String firstName;
    private String lastName;
   private String addrs;
    
    
        
    public sto_t( int id,String Fname,String price, String Lname)
    {
        this.id =id;
        this.firstName = Fname;
        this.addrs=  price; 
        this.lastName = Lname;
       
    }
    
    
          public int getid()
    {
        return id;
    }
        public String getaddrs()
    {
        return addrs;
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
    

