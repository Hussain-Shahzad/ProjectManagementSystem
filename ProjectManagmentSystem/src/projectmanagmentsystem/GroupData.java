/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanagmentsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hussa
 */
public class GroupData {
    
    private List<StudentData> stds= new ArrayList<StudentData>();
    private String id;
    private ProjectData prj;
    private String assignment;
    private String marks;

    public List<StudentData> getStds() {
        return stds;
    }

    public void setStds(String n) {
        boolean flag=false;
        Addstudent s=new Addstudent();
        int size=s.getStdList().size();
        
        for (int i=0;i<size;i++)
        {
            if(n.equals(s.getStdList().get(i).getName()))
            {
                flag=true;
                ADD(s.getStdList().get(i));
                break;
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProjectData getPrj() {
        return prj;
    }

    public void setPrj(String n) {
        boolean flag=false;
        Addproject p=new Addproject();
        int size=p.getPrjList().size();
        
        for (int i=0;i<size;i++)
        {
            if(n.equals(p.getPrjList().get(i).getTitle()))
            {
                flag=true;
                prj=p.getPrjList().get(i);
                break;
            }
        }
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
    
    public void ADD(StudentData s)
    {
        stds.add(s);
    }
    
}
