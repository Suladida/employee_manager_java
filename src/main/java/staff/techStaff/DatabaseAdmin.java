package staff.techStaff;

import staff.Employee;

public class DatabaseAdmin extends Employee {

    DatabaseAdmin databaseAdmin;


public DatabaseAdmin(String name, String niNumber, double salary){
    super (name, niNumber, salary);
}

public double getBonus(){
    return salary * 0.01;
}

}
