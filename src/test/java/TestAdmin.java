import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;


public class TestAdmin {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Patricia", "ZA654321Q", 20000);
    }

    @Test
    public void canGetName() {
        assertEquals("Patricia", databaseAdmin.getName());
   }

    @Test
    public void canGetNiN() {
        assertEquals("ZA654321Q", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(20000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(21000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canUpdateName() {
        databaseAdmin.setName("John");
        assertEquals("John", databaseAdmin.getName());
    }

}
