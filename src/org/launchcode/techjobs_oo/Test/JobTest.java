package org.launchcode.techjobs_oo.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.*;


public class JobTest {
    private Job job1;
    private Job job2;
    private Job job3;
    private Job job4;
    private Job job5;


    @Before
    public void setUpJobs(){
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job("t",new Employer("e"),new Location("s"),new PositionType("t"), new CoreCompetency("j.o.b"));
    }
    @Test
    public void testSettingJobId(){
        assertEquals(1,job2.getId()-job1.getId());
//        assertEquals(2,job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(job3 instanceof Job);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof  PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(job3==job4);
    }
    @Test
    public void toStringTest(){

        String expected;
        expected ="\n" +
                "ID: " + job5.getId() + "\n" +
                "Name: t\n" +
                "Employer: e\n" +
                "Location: s\n" +
                "Position Type: t\n" +
                "Core Competency: j.o.b\n" +
                "\n";

        assertEquals(expected,job5.toString());
    }
}
