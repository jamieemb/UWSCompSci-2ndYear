package StudentTest;

public class PartTime extends Student {

    private final Integer numberOfModules;

    public PartTime(String name, Integer numberOfModules) {
        super(name);
        this.numberOfModules = numberOfModules;
    }


    public String toString(){
        String partTimeDetails = "";
        partTimeDetails += super.toString();
        partTimeDetails += "\tmodules: " + this.numberOfModules;
        return partTimeDetails;

    }
}