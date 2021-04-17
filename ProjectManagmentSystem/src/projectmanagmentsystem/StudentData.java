/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanagmentsystem;

/**
 *
 * @author hussa
 */
public class StudentData {
    private String name;
    private String regno;
    private String cnic;
    private String email;
    private String password;
    private String grpid;
    private String address;

    public String getName() {
        return name;
    }

    public boolean setName(String n) {
        
        boolean flag=true;
      int size=n.length();
      for(int i=0;i<size;i++)
         {
          if (!(n.charAt(i)>='A'&& n.charAt(i)<='Z' || n.charAt(i)>='a' && n.charAt(i)<='z' ||n.charAt(i)==' '))
             {
              flag=false;
             }
         }
      
      if (flag==true)
       {
         name=n;
       }
       return flag;
      
    }

    public String getRegno() {
        return regno;
    }

    public boolean setRegno(String regNo)
     {
         int size=regNo.length();
      boolean flag=true;
      if(!(regNo.charAt(4)=='-' && regNo.charAt(7)=='-'))
       {
           flag=false;
       }
      for (int i=0;i<4;i++)
       {
            if(!(regNo.charAt(i)>='0' && regNo.charAt(i)<='9') )
             {
                flag=false;
             }
       }
            for(int i=5;i<7;i++)
             {
               if(!(regNo.charAt(i)>='A' && regNo.charAt(i)<='Z') )
               {
                  flag=false;
               }
             }
            for (int i=8;i<size;i++)
            {
               if(!(regNo.charAt(i)>='0' && regNo.charAt(i)<='9') )
               {
                 flag=false;
               }
            }

      if (flag==true)
       {
         regno=regNo;
       }
      return flag;
     }

    public String getCnic() {
        return cnic;
    }

    public boolean setCnic(String c) {
        boolean flag=true;
        int size=c.length();
        if (size==13)
        {
            for(int i=0;i<size;i++)
            {
                if(!(c.charAt(i)>='0' && c.charAt(i)<='9'))
                {
                    flag=false;
                }
            }
        
        }else{
            flag=false;
        }
        if(flag==true)
        {
            cnic=c;
        }
        return flag;
        
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        this.email = email;
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGrpid() {
        return grpid;
    }

    public void setGrpid(String grpid) {
        this.grpid = grpid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
