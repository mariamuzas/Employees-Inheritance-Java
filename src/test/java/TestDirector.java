import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class TestDirector {
    Director director;

    @Before
    public void before() {
        director = new Director("Pete", "AZ123456Q", 30000, "Accounts", 300);
    }

    @Test
    public void canGetName() {
        assertEquals("Pete", director.getName());
   }

    @Test
    public void canGetNiN() {
        assertEquals("AZ123456Q", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, director.getSalary(), 0.01);
    }
    @Test
    public void canGetDeptName() {
        assertEquals("Accounts", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
         assertEquals(31000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
         assertEquals(300, director.getBudget(), 0.01);
    }
}
