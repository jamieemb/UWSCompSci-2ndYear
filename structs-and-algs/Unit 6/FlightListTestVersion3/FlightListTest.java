package FlightListTestVersion3;

import java.util.Formatter;

public class FlightListTest {

    public static void main (String[] args) {

        // Declaring variables
        int flightListSize = Input.getInteger("How long is the Flight List? : ");
        FlightList flights = new FlightList(flightListSize);
        String destination;
        int hours;
        int minutes;
        int menuSelection;
        int inputCounter = 0;

        // Displaying the user menu
        do {
            System.out.println("\n" + "********************");
            System.out.println("1: Add Flight");
            System.out.println("2: Display Flight List");
            System.out.println("0: Quit");
            menuSelection = Input.getInteger("> ");


            switch (menuSelection) {

                case 0 -> System.out.println("Goodbye!");

                case 1 -> {

                    if (inputCounter != (flightListSize)) {
                        // Getting initial Inputs
                        destination = Input.getString("Enter Destination: ");

                        hours = Input.getInteger("Enter Hours: ");
                        // Exception handling for hours
                        while (hours < 0 || hours > 23) {
                            System.out.println("Invalid Range - Enter Value Between 0 & 23");
                            hours = Input.getInteger("Enter Hours:");
                        }

                        minutes = Input.getInteger("Enter Minutes: ");
                        // Exception handling for minutes
                        while (minutes < 0 || minutes > 59) {
                            System.out.println("Invalid Range - Enter Value Between 0 & 59");
                            minutes = Input.getInteger("Enter Minutes:");
                        }

                        flights.addFlights(destination, hours, minutes);
                        inputCounter++;
                    }

                    else {
                        System.out.println("Sorry. You've reached the limit for this flight list");
                    }
                }

                case 2 -> {
                    System.out.println();
                    System.out.println( "TIME                    DESTINATION\n");
                    System.out.println(flights);

                }

                default -> System.out.println("Invalid Option");
            }
        }
        while (menuSelection != 0) ;
    }
}



