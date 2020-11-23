import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestManager {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "AZ123456Q", 25000, "Accounts");
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", manager.getName());
   }

    @Test
    public void canGetNiN() {
        assertEquals("AZ123456Q", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(25000, manager.getSalary(), 0.01);
    }
    @Test
    public void canGetDeptName() {
        assertEquals("Accounts", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
         assertEquals(26000, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryByNegativeAmount() {
        manager.raiseSalary(-1000);
        assertEquals(25000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, manager.payBonus(), 0.01);
    }

    @Test
    public void canUpdateName() {
        manager.setName("Maria");
        assertEquals("Maria", manager.getName());
    }

    @Test
    public void cannotEnterNullForName() {
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }
}
