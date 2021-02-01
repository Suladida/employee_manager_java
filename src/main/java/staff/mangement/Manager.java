package staff.mangement;

import staff.Employee;

public class Manager extends Employee {

    private String name;
    private String niNumber;
    private int salary;
    private String deptName;

    public Manager(String name, String niNumber, int salary, String deptName){
        super("Trixie", "TRX20595B", 100000);
//        this.name = name;
//        this.niNumber = niNumber;
//        this.salary = salary;
        this.deptName = "Admin";
    }

    public String getDeptName(){
        return deptName;
    }

}
