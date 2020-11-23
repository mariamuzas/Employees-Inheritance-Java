import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Iain", "KY987352T", 30_000);
    }

    @Test
    public void canGetName() {
        assertEquals("Iain", developer.getName());
    }

    @Test
    public void canGetNiN() {
        assertEquals("KY987352T", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(31000, developer.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryWithNegative() {
        developer.raiseSalary(-1000);
        assertEquals(30000, developer.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(300, developer.payBonus(), 0.01);
    }

    @Test
    public void canUpdateName() {
        developer.setName("Bob");
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void cannotEnterNullForName() {
        developer.setName(null);
        assertEquals("Iain", developer.getName());
    }
}
