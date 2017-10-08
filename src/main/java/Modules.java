/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jack
 */

import org.joda.time.DateTime;

public class Modules extends CourseName {
    
    private String ModuleName;
    private String ModuleID;
    
    //Constructor class for modules
    public Modules(String Coursename,DateTime sd, DateTime fd, String ModuleName, String ModuleID)
    {
        super(Coursename, sd, fd);            // call superclass constructor
        this.ModuleName = ModuleName;
        this.ModuleID = ModuleID;
        
    }
    
    public String getModulename()
    {
        return ModuleName;
    }
    
    public void setname(String name)
    {
        this.ModuleName = name;
    }
    
    public String getid()
    {
        return ModuleID;
    }
    
    public void setid(String id)
    {
        this.ModuleID = id;
    }
    
    @Override
    public String toString()
    {
        return "\nModule Name       " +ModuleName+ 
                "\nModule ID:       " +ModuleID +super.toString();
    }
}
