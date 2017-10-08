/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jack
 */
import java.util.ArrayList;
import org.joda.time.DateTime;

public abstract class CourseName {
    
    String Coursename;
    public DateTime start_date;
    public DateTime finish_date;
    
    ArrayList<Modules> modules;
    
    public CourseName(String Coursename, DateTime sd, DateTime fd)
    {
        this.Coursename = Coursename;
        this.start_date = sd;
        this.finish_date = fd;
        //this.modules = modules
    }
    
    public String getname()
    {
        return Coursename;
    }
    
    public void setname(String name)
    {
        this.Coursename = name;
    }
    
    public DateTime getsd()
    {
        return start_date;
    }
    
    public void set_sd(DateTime start_date)
    {
        this.start_date = start_date;
    }
    
    public DateTime getfd()
    {
        return finish_date;
    }
    
    public void set_fd(DateTime finish_date)
    {
        this.finish_date = finish_date;
    }
    
    
    @Override
    public String toString()
    {
        return "\nCourse Name:      " +Coursename+ 
                "\nStart Date:      " +start_date+ 
                "\nEnd Date:        " +finish_date;
    }

}