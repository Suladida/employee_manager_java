package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getNINumber(){
        return niNumber;
    }

    public double getSalary(){
        return salary;
    }

    public double raiseSalary(Double raise){
        salary = salary + raise;
        return salary;
    }

    public double payBonus(){
        return (salary * 0.1);
    }

}
