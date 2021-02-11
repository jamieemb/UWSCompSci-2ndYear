public class Drink extends MenuItem{

    // Declaring variables
    private Integer measure;

    // Constructor
    public Drink(String name, Integer price, Integer measure){
        super(name, price);
        this.measure = measure;
    }

    // toString method
    public String toString() {
        String drinkDetails = "";
        drinkDetails += super.toString();
        drinkDetails += "\tMeasure: " + this.measure.toString();
        return drinkDetails;
    }
}
