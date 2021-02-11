public class PartTime extends Student {

    private final Integer numberOfModules;

    public PartTime(String name, Integer numberOfModules) {
        super(name);
        this.numberOfModules = numberOfModules;
    }

    // Returns new string showing partTime details
    public String toString(){
        String partTimeDetails = "";
        partTimeDetails += super.toString();
        partTimeDetails += String.format("%10d", this.numberOfModules);
        return partTimeDetails;

    }
}