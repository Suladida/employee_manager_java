import org.junit.Before;
import org.junit.Test;
import staff.mangement.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("DevDude", "DEV123456", 10000);
    }

    @Test
    public void canGetName(){
        assertEquals("DevDude", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("DEV123456", developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(10000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1.0);
        assertEquals(10001, developer.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1000, developer.getBonus(), 0.1);
    }

}
