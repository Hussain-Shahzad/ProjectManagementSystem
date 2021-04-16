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
public class AdvisorData {
    
    private String name;
    private String cnic;
    private String department;
    private String designation;
    private String email;
    private String password;

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
        return flag;
        
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String e) {
        e = email;
        return true;
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String p) {
        p = password;
        return true;
    }

}