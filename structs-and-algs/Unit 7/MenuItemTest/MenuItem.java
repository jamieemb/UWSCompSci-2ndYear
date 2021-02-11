import java.awt.*;

public class MenuItem {

    // Declaring initial variables
    protected String name;
    private Integer price;

    // Constructor
    public MenuItem(String name, Integer price ){
        this.name=name;
        this.price=price;
    }

    // toString Method
    public String toString(){
        String menuItemDetails = "";
        menuItemDetails += "name: " + this.name + "price: " + this.price;
        return  menuItemDetails;

    }

    // Method for changing the price
    public void changePrice(Integer newPrice){
        this.price=newPrice;
    }
}
