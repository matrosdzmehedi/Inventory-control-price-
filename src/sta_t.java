/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehedi
 */
public class sta_t {
    
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private int office_phone;
    private int mobile;
    private String email;
    private String join;
    private String leave;
    private String DOB;
    
    
      public sta_t(int Id, String Fname, String Lname, String gender,int office,int mobile, String email, String join, String leave,String DOB)
    {
        this.id = Id;
        this.firstName = Fname;
        this.lastName = Lname;
        this.gender = gender;
        this.office_phone=office;
        this.mobile=mobile;
        this.email=email;
        this.join=join;
        this.leave=leave;
        this.DOB=DOB;
    }
    
          public int getId()
    {
        return id;
    }
          
          
              public int getoffice()
    {
        return office_phone;
    }
              
              
                  public int getmob()
    {
        return mobile;
    }
    
                    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastNAme()
    {
        return lastName;
    }
    
     public String getgen()
    {
        return gender;
        
        
        
    }
     
      public String geteml()
    {
        return email;
    }
     
       public String getjn()
    {
        return join;
    }
     
         public String getlv()
    {
        return leave;
    }
         
           public String getdob()
    {
        return DOB;
    }
    
}
