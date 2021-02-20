public class ItemTest {

    public static void main (String [] args ){

        // Single object instantiation
        Item newItem = new Item("Coke", 5);


        // User menu
        System.out.println("[1] Dispense Item");
        System.out.println("[2] Restock Item");
        System.out.println("[3] View Stock Amount");
        System.out.println("[0] Quit");

        int userSelection;
        do {
            userSelection = Input.getInteger("What would you like to do? >> ");

            switch (userSelection) {

                case 1 -> System.out.println(newItem.dispense());
                case 2 -> {
                    int restockAmount = Input.getInteger("How many items are you restocking? >> ");
                    newItem.restock(restockAmount);
                    System.out.println("Updated Stock: " + newItem.amountInStock);
                }

                case 3 -> System.out.printf("Name: %s\nAmount In Stock: %d \n", newItem.name, newItem.amountInStock);

                case 0 -> System.out.println("Goodbye!");
            }
        }while(userSelection!=0);





    }
}
