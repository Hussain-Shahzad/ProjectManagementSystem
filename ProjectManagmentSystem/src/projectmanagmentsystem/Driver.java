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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void LOGIN(){
        Login loginpage=new Login();
        loginpage.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        
        //loginpage.show();
        Addadvisor ad=new Addadvisor();
        Addproject ap=new Addproject();
        Addstudent as=new Addstudent();
        
        
        ap.loadData("PROJECTS.txt");
        ad.loadData("ADVISORS.txt");
        as.loadData("STUDENTS.txt");
       
        LOGIN();
        
        
    }
    
}
