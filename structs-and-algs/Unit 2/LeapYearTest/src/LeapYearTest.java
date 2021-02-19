public class LeapYearTest {

    public static void main (String [] args){

        boolean leapYear = false;
        boolean quit = false;

        do {
            int year = Input.getInteger("Year: ");

            if (year%4 == 0){
                leapYear = true;
            }
            System.out.println("leapYear: " + leapYear);

            int userSelection = Input.getInteger("Continue? [1]Yes [2]No >> ");
            if (userSelection!=1) {quit=true;}

        } while (quit == false);
    }
}
