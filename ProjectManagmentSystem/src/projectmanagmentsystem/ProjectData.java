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
public class ProjectData {
    
    private String title;
    private String id;
    private String type;
    private String disc;
    private String group;
    private AdvisorData adv;

    public String getTitle() {
        return title;
    }

    public boolean setTitle(String n) {
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
         title=n;
       }
       return flag;
    }

    public String getId() {
        return id;
    }

    public boolean setId(String d) {
        boolean flag=true;
        int size=d.length();
        if(size==4)
        {
         for(int i=0;i<size;i++)
         {
          if (!(d.charAt(i)>='A'&& d.charAt(i)<='Z' || d.charAt(i)>='0' && d.charAt(i)<='9'))
             {
              flag=false;
             }
         }   
            
        }else{
        
            flag=false;
        }
        
        if(flag==true)
        {
            id=d;
        }
        return flag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }
    
    public String getAdv()
    {
        return adv.getName();
    }
    
    public boolean setAdv(String n)
    {
        boolean flag=false;
        Addadvisor a=new Addadvisor();
        int size=a.getAdvList().size();
        
        for (int i=0;i<size;i++)
        {
            if(n.equals(a.getAdvList().get(i).getName()))
            {
                flag=true;
                adv=a.getAdvList().get(i);
                break;
            }
        }
        
        return flag;
    }
    
}
