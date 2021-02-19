public class WageTest {

    public static void main(String[] args) {
        Integer weeklyHoursWorked = Input.getInteger("weekly hours worked: ");
        Integer weeklyWage;
        final Integer STANDARD_WEEKLY_HOURS = 35;
        final Integer STANDARD_HOURLY_RATE = 15;
        final Integer ADDITIONAL_OVERTIME_HOURLY_RATE = 10;
        weeklyWage = weeklyHoursWorked * STANDARD_HOURLY_RATE;
        // add code here

        
        System.out.println("hours worked: " + weeklyHoursWorked
                + " wage: " + weeklyWage);
    }
}
