import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;


    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("DataDude", "DATA12345", 100000);
    }

    @Test
    public void canGetName(){
        assertEquals("DataDude", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("DATA12345", databaseAdmin.getNINumber());
    }

    @Test
    public void CanGetSalary(){
        assertEquals(100000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1.0);
        assertEquals(100001, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(10000, databaseAdmin.payBonus(), 0.1);
    }


}
