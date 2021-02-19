public class BalanceTest {

    public static void main(String[] args) {

        // Initial Balance
        int balance = Input.getInteger("What is the initial balance? ");


        // Menu
        System.out.println("1. Make a deposit");
        System.out.println("2. Make a withdrawal");
        System.out.println("3. Add Interest to the Account");
        System.out.println("4. Add charges to the Account");
        System.out.println("0. Quit");

        int userSelection;
        do {
            userSelection = Input.getInteger("What would you like to do? ");


            // Switch statement
            switch (userSelection) {

                case 1 -> {
                    int add = Input.getInteger("Deposit amount: ");
                    balance += add;
                    System.out.printf("New balance: %d\n", balance);
                }

                case 2 -> {
                    int subtract = Input.getInteger("Withdrawal amount: ");

                    if (balance - subtract >= -1000) {
                        balance -= subtract;
                        System.out.printf("New balance: %d\n", balance);
                    } else {
                        System.out.println("Cannot complete request. Account too overdrawn");
                    }

                }

                case 3 -> {
                    if (balance <= 0) {
                        System.out.println("No interest added as account is overdrawn");
                    } else {
                        balance += balance * 0.05;
                        System.out.printf("New balance: %d\n", balance);

                    }

                }

                case 4 -> {
                    if (balance < 0) {
                        balance += balance * 0.10;
                        System.out.printf("New balance: %d\n", balance);
                    } else {
                        System.out.println("No charges made as account is not overdrawn");
                    }

                }

                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Incorrect input");
            }
        }
        while (userSelection != 0);


    }

}
