/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jack
 */
public class UsernameJUnitTest {
    
    @Test
	public void test() {
            
                DateTime s1_start_date = new DateTime(2014, 4,9,12,0,0,0);
                DateTime s1_finish_date = new DateTime(2018, 28,5,12,0,0,0);
                
		Student s1 = new Student("Sean","Kelly","15 Nov 1996", 1443535, 20, "Computer Science and IT",s1_start_date , s1_finish_date, "Programming","CT213" );
		String output = s1.getusername("Sean", "Kelly", 20);
		assertEquals("SeanKelly25", output);
	}
}
