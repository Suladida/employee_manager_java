import org.junit.Before;
import org.junit.Test;
import staff.mangement.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void Manager(){
        manager = new Manager("John", "GFR234564", 100, "Admin");
    }

    @Test
    public void hasDeptName(){
        assertEquals("Admin", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.0);
        assertEquals(101, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(10.0, manager.payBonus(), 0.1);
    }

}
