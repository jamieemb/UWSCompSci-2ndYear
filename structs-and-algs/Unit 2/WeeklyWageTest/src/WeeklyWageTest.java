public class WeeklyWageTest {

    public static void main (String[] args){
        int weeklyHoursWorked = 0;
        int employeeNumber = 0;

        int numberOfEmployees = Input.getInteger("How many employees do you want to add? >> ");

        do {

        System.out.printf("--Employee %d-- \n", employeeNumber+1);

        for (int i = 0; i<6; i++){
            weeklyHoursWorked+=Input.getInteger(String.format("Day %d ", i+1));
        }

        if (weeklyHoursWorked > 35){
            System.out.printf("hours worked: %d wage: %d\n", weeklyHoursWorked, ((weeklyHoursWorked - 35) * 25) + (35 * 15));
            System.out.println("");
            weeklyHoursWorked=0;
        }
        else
        {
            System.out.printf("hours worked: %d wage: %d\n", weeklyHoursWorked, weeklyHoursWorked*15 );
            System.out.println("");
            weeklyHoursWorked=0;
        }
            employeeNumber++;
        }
        while (employeeNumber != numberOfEmployees);
    }
}
