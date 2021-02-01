import org.junit.Before;
import org.junit.Test;
import staff.mangement.Manager;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("John", "GFR234564", 100, "Engineering");
    }

    @Test
    public void hasName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Engineering", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.0);
        assertEquals(101, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(10.0, manager.getBonus(), 0.1);
    }

}
