public class CalculatorTest {

    public static void main (String [] args){

        boolean quit = false;

        do {

            double firstNumber = Input.getInteger("First Number: ");
            double secondNumber = Input.getInteger("Second Number");

            // User menu
            System.out.println("0 Quit");
            System.out.println("1 Add");
            System.out.println("2 Subtract");
            System.out.println("3 Multiply");
            System.out.println("4 Integer Division");
            System.out.println("5 Floating Point Division\n");
            int userSelection = Input.getInteger("What would you like to do? ");

            // Switch statement
            switch (userSelection) {

                case 0 -> quit = true;
                case 1 -> System.out.printf("add: %d + %d = %d\n", (int) firstNumber, (int) secondNumber, (int)firstNumber + (int)secondNumber);
                case 2 -> System.out.printf("subtract: %d - %d = %d\n", (int) firstNumber,(int)  secondNumber, (int) firstNumber - (int) secondNumber);
                case 3 -> System.out.printf("multiply: %d * %d = %d\n",(int)  firstNumber, (int) secondNumber, (int) firstNumber * (int) secondNumber);
                case 4 -> {
                    if (secondNumber!=0){
                        System.out.printf("integer divide: %d / %d = %d r %d\n",(int)  firstNumber, (int) secondNumber, (int) firstNumber / (int) secondNumber, (int)firstNumber % (int) secondNumber);
                    }
                    else System.out.println("Cannot divide by zero");
                    break;
                }
                case 5 -> {

                    if (secondNumber!=0) {
                        System.out.printf("FP Divide: %f / %f = %f\n", firstNumber, secondNumber, firstNumber / secondNumber);
                    }
                    else System.out.println("Cannot divide by zero");
                    break;
                    }
                default -> System.out.println("Incorrect input");
                }

        } while(quit!=true);
    }
}
