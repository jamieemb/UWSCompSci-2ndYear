package FlightListTestVersion4;

public class FlightList {

    private final Flight[] flights;
    private int numberOfFlights;

    public FlightList(int flightListSize){
        this.flights = new Flight[flightListSize];
        this.numberOfFlights = 0;

    }

    public void addFlights(String destination, int hours, int minutes){
        this.flights[this.numberOfFlights] = new Flight(destination, hours, minutes);
        this.numberOfFlights++;

    }

    public void sort(){
        SelectionSort.sort(this.flights);
    }

    @Override
    public String toString(){

        StringBuilder flightDetails = new StringBuilder();
        if (this.numberOfFlights !=0){
            for (int index = 0; index<this.numberOfFlights;index++)
                flightDetails.append(this.flights[index]).append("\n");
        }
        else
            flightDetails.append("There are no flights in the flight list");

        return flightDetails.toString();

    }
}
