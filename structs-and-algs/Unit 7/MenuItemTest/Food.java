
public class Food extends MenuItem {

    // Declaring variables
    private Boolean vegetarian;


    // Constructor
    public Food(String name, Integer price, Boolean vegetarian){

        super(name, price);
        this.vegetarian = vegetarian;
    }

    // toString method
    public String toString(){
        String vegetarianDetails = "";
        vegetarianDetails += super.toString();
        vegetarianDetails += "\t Vegetarian: " + this.vegetarian.toString();
        return vegetarianDetails;

    }

    // Returns Vegetarian status of the object
    public Boolean checkVegetarian(){
       return this.vegetarian;
    }

    // Changes the Vegetarian status of the object
    public Boolean changeVegetarian(Boolean vegChange){
        return this.vegetarian=vegChange;
    }

    // Returns object name
    public String getName(){
        return this.name;
    }
}
