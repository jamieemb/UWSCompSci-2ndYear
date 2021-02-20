public class Employee {

    private final int number;
    private final String name;
    private final String location;
    private int salary;


    // Constructor
    public Employee(int number, String name, String location, int salary) {
        this.number = number;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }


    // Method for increase salary of employee object
    public void increaseSalary(int salaryIncrease){
        this.salary += salaryIncrease;
    }

    // Method for returning if the location the employee works in is the same as that passed as a parameter
    public Boolean worksInLocation(String checkLocation){
        boolean worksInLocation = false;

        if (this.location.equals(checkLocation)){
            worksInLocation = true;
        }
        return worksInLocation;
    }

    // toString method for return all employee details
    @Override
    public String toString() {
        return String.format("Name: %s\n Number: %d\n Location: %s\n Salary: %d\n", this.name, this.number, this.location, this.salary);
    }
}
