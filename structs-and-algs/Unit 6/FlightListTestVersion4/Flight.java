package FlightListTestVersion4;

public class Flight implements Comparable <Flight> {

// Declaring variables
    private final String destination;
    private final Integer hours;
    private final Integer minutes;

    public Flight (String destination, int hours, int minutes){
       this.destination = destination;
       this.hours = hours;
       this.minutes = minutes;
    }

// Override methods
    @Override
    public int compareTo(Flight flight) {
        int result;

        result = this.hours.compareTo(flight.hours);
        if (result == 0) {
            result = this.minutes.compareTo(flight.minutes);
        }
        if (result == 0) {
            result = this.destination.compareTo(flight.destination);
        }
        return result;
    }

    // Override toString method
    @Override
    public String toString(){
        String flightDetails;
        String timeString= "";
        if(this.hours<10)
            timeString+="0";
        timeString+=this.hours+":";
        if(this.minutes<10)
            timeString+="0";
        timeString+=this.minutes;
        flightDetails=String.format("%-20s%-20s",timeString,this.destination);
        return flightDetails;
    }
}
