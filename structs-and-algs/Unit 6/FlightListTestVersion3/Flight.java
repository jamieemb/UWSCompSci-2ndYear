package FlightListTestVersion3;/*
Maintains information about a particular flight

 */



public class Flight {

// Declaring variables
    String destination;
    int hours;
    int minutes;

    public Flight (String destination, int hours, int minutes){
        setDestination(destination);
        setHours(hours);
        setMinutes(minutes);
    }

// Setters
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

// Override toString method
    @Override
    public String toString() {
        return
                String.format("%d:%d                    %s", hours, minutes, destination);


    }
}
