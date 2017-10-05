
import org.joda.time.DateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jack
 */
public final class Student extends Modules {
	
	// Access modifiers
	private String fname;
	private String lname;
	private String DOB;
	private int age;
	private int studentID;
	private String username;
        
	//Set up constructor
	public Student(String fname, String lname, String DOB, int studentID, int age, 
                String Coursename,DateTime sd, DateTime fd, String ModuleName, String ModuleID) {
		
                super(Coursename, sd, fd, ModuleName, ModuleID);
		this.fname = fname;
		this.lname = lname;
		this.DOB = DOB;
		this.studentID = studentID;
		this.age = age;
		
	}
	
	
	// Getters and setters
	public String getfname()
	{
		return fname;
	}
	
	
	public void setfname(String fname) 
	{
		this.fname=fname;
	}
	
	
	// Getters and setters
	public String getlname()
	{
		return lname;
	}
	
	
	public void setlname(String lname)
	{
		this.lname = lname;
	}
	
	
	// Getters and setters
	public String getDOB()
	{
		return DOB;
	}
	
	public void setDOB(String DOB)
	{
		this.DOB = DOB;
	}
	
	
	// Getters and setters
	public int getStudentID()
	{
		return studentID;
	}
	
	
	public void setStudentID(int studentID)
	{
		this.studentID=studentID;
	}
	
	// Getters and setters
	public int getage()
	{
		return age;
	}
			
	public void setage(int age)
	{
		this.age=age;
	}	
	
	
	
	/*Part b: generate students username by concatenating their name and age*/
	public String getusername(String fname, String lname, int age)
	{
		return fname+lname+age;
	}
        
       
        @Override
        public String toString()
        {
            return "\n\nFirstname: " +fname+ 
                    "\nLastname: " +lname+ 
                    "\nDOB: " +DOB+ 
                    "\nStudent ID: " +studentID+ 
                    "\nAge: " +age +super.toString();
        }

}

