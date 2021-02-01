import org.junit.Before;
import org.junit.Test;
import staff.mangement.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("DirectorDude", "DIRE12345", 1000000, "Circus", 5000);
    }

    @Test
    public void directorHasName(){
        assertEquals("DirectorDude", director.getName());
    }

    @Test
    public void directorHasNINumber(){
        assertEquals("DIRE12345", director.getNINumber());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(1000000, director.getSalary(), 0.1);
    }

    @Test
    public void directorHasDeptName(){
        assertEquals("Circus", director.getDeptName());
    }

    @Test
    public void directorHasBudget(){
        assertEquals(5000, director.getBudget(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10.0);
        assertEquals(1000010, director.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(100000, director.getBonus(), 0.1);
    }

}
