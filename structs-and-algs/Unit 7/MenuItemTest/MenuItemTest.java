public class MenuItemTest {

    public static void main (String[] args){

        // Instantiating new objects
        Drink drink = new Drink("Coke ", 2, 300);
        Food food = new Food("soup", 3, true);
        MenuItem food1 = new Food("steak", 15, false);

        // Initial Object values before price change
        System.out.println("After Initial Setup");
        System.out.println("\t" + drink);
        System.out.println("\t" + food);
        System.out.println("\t" + food1);

        // Calls method to change the price of objects
        drink.changePrice(3);
        food.changePrice(5);
        food1.changePrice(16);

        // Displays object information after price change
        System.out.println("After Price Change");
        System.out.println("\t" + drink);
        System.out.println("\t" + food);
        System.out.println("\t" + food1);

        // Checking if items are vegetarian
        System.out.println("Check if Vegetarian");
        System.out.println("\t"+food.getName()+ " "+food.checkVegetarian());
        System.out.println("\t"+((Food)food1).getName() + " " + ((Food)food1).checkVegetarian());

        // Calls method for changing the vegetarian status of the object
        food.changeVegetarian(false);
        ((Food) food1).changeVegetarian(true);

        // Displays object information after vegetarian status has been changed
        System.out.println(" ");
        System.out.println("\t" + food.getName() + " " + food.checkVegetarian());
        System.out.println("\t" + ((Food)food1).getName() + " " + ((Food)food1).checkVegetarian());


    }
}
