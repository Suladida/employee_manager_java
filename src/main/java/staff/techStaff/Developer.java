package staff.techStaff;

import staff.Employee;

public class Developer extends Employee {

    Developer developer;

    public Developer(String name, String niNumber, double salary){
        super(name, niNumber, salary);
    }

    @Override
    public double getBonus() {
        return (salary * 0.01);
    }
}
