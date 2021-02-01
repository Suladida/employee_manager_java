package staff.mangement;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;
    String name;
    String niNumber;
    int salary;

    public Manager(String name, String niNumber, int salary, String deptName){
        super("Trixie", "TRX20595B", 100);
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
        this.deptName = "Admin";
    }

    public String getDeptName(){
        return deptName;
    }

}
