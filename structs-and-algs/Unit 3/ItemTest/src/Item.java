public class Item {

    // Declaring variables
    String name;
    int amountInStock;

    public Item(String name, int amountInStock){
        this.name = name;
        this.amountInStock = amountInStock;
    }

    public Boolean dispense(){
        boolean dispensed = false;
        if (amountInStock>0){
            amountInStock-=1;
            dispensed = true;
        }
        return dispensed;
    }


    public void restock(int stockIncrease){
        this.amountInStock+=stockIncrease;
    }

    public String toString(){
        return this.name + this.amountInStock;
    }
}
