
public class EnrolTest {

    public static void main(String [] args) {

        // Take user input to define the length of the array

        int arrayLength = Input.getInteger("How long is the Student List?\n" + ">> ");
        StudentList students = new StudentList(arrayLength);

        int arrayLengthCounter = 0;
        int userSelection;

        // Displays menu of user options
        do {
            System.out.println("[1] Add Student");
            System.out.println("[2] Display Students");
            System.out.println("[3] Issue Loans");
            System.out.println("[0] Quit");
            System.out.println("\n");

            userSelection = Input.getInteger("What would you like to do?\n" + ">> ");

            switch (userSelection) {

                case 0 -> System.out.println("Goodbye!");
                case 1 -> {
                    if (arrayLengthCounter != arrayLength) {

                        // Get student's name
                        String studentName = Input.getString("What is the students name?\n" + ">> ");


                        // Get student type
                        System.out.println("[1] Full Time");
                        System.out.println("[2] Part Time\n");
                        userSelection = Input.getInteger("Is the Student Full Time or Part Time?\n" + ">> ");


                        if (userSelection == 1) {
                            // Adding object to the array and increasing counter
                            students.addFullTime(studentName);
                            arrayLengthCounter++;

                            // Part Time Student
                        } else if (userSelection == 2) {

                            Integer numberOfModules = Input.getInteger("How many modules is the student taking?\n" + ">> ");

                            // Adding object to the array and increasing counter
                            students.addPartTime(studentName, numberOfModules);
                            arrayLengthCounter++;

                        } else {
                            System.out.println("Incorrect Input");
                        }
                    } else {
                        System.out.println("Array is already full");
                    }
                }

                case 2 -> System.out.println(students);
                case 3 -> students.issueLoans();
                default -> System.out.println("Invalid Option");
            }
        } while (userSelection!=0);
    }
}
