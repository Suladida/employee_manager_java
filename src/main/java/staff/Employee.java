package staff;

public class Employee {

    private String name;
    private String niNumber;
    private double salary;
    Employee employee;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void changeName(String newName){
        name = newName;
    }

    public String getNINumber(){
        return niNumber;
    }

    public double getSalary(){
        return salary;
    }

    public double raiseSalary(Double raise){
        if(raise > 0){
        salary = salary + raise; }
        return salary;
    }

    public double getBonus(){
        return (salary * 0.1);
    }

}
