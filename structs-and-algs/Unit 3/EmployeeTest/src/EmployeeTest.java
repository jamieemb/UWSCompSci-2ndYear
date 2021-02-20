public class EmployeeTest {

    public static void main(String[] args) {

        int number = Input.getInteger("Employee Number: ");
        String name = Input.getString("Name: ");
        String location = Input.getString("Location: ");
        int salary = Input.getInteger("Salary: £");

        // Instantiating a new Employee object
        Employee employee = new Employee(number, name, location, salary);
        int userSelection;

        do {
            // User Menu
            System.out.println("[1] Increase Salary");
            System.out.println("[2] Check Location");
            System.out.println("[3] View Employee Information");
            System.out.println("[0] Quit");
            userSelection = Input.getInteger("What would you like to do? >> ");

            // Switch statement for user Selection
            switch (userSelection) {
                case 1 -> {
                    int salaryIncrease = Input.getInteger("How much would you like to increase the salary by? >> £");
                    employee.increaseSalary(salaryIncrease);
                }
                case 2 -> {
                    String locationToCheck = Input.getString("What location would you like to check? >> ");
                    System.out.println(employee.worksInLocation(locationToCheck) + "\n");
                }
                case 3 -> System.out.println(employee.toString());
                case 0 -> System.out.println("Goodbye!");
            }


        } while (userSelection != 0);


    }


}
