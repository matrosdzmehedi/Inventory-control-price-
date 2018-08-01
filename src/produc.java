/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehedi
 */
public class produc {/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    private int id;
    private String firstName;
    private int lastName;
   private int addrs;
   private String mx;
    
    
        
    public produc( int id,String Fname,String mx, int Lname,int price)
    {
        this.id =id;
        this.firstName = Fname;
        this.mx= mx;
        this.addrs=  price; 
        this.lastName = Lname;
       
    }
    
    
           public String getmx()
    {
        return mx;
    }
          public int getid()
    {
        return id;
    }
        public int getaddrs()
    {
        return addrs;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public int getLastNAme()
    {
        return lastName;
    }
    
   
    
}
    


    

