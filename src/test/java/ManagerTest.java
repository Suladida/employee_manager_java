import org.junit.Before;
import org.junit.Test;
import staff.mangement.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void Manager(){
        manager = new Manager("John", "GFR234564", 20000, "Admin");
    }

    @Test
    public void hasDeptName(){
        assertEquals("Admin", manager.getDeptName());
    }

}
