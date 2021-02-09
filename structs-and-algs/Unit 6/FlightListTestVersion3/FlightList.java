package FlightListTestVersion3;/*
Constructor class for FlightListTestVersion3.Flight List object

 */


public class FlightList {

    private Flight[] flights;
    private int numberOfFlights;


    public FlightList(int flightListSize){
        this.flights = new Flight[flightListSize];
        this.numberOfFlights = 0;

    }

    public void addFlights(String destination, int hours, int minutes){
        this.flights[this.numberOfFlights] = new Flight(destination, hours, minutes);
        this.numberOfFlights++;

    }

    @Override
    public String toString(){

        String flightDetails = new String();
        if (this.numberOfFlights !=0){
            for (int index = 0; index<this.numberOfFlights;index++)
                flightDetails += this.flights[index] + ("\n");
        }
        else
            flightDetails += ("There are no flights in the flight list");

        return flightDetails;


    }





}
