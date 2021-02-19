public class ArithmeticTest {

    public static void main (String [] args){

        int firstNumber = Input.getInteger("Enter the first Number: ");
        int secondNumber = Input.getInteger("Enter the second Number: ");

        double firstNumDouble = firstNumber;
        double secondNumDouble = secondNumber;

        System.out.println("Addition: " + firstNumber+secondNumber);
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + firstNumber*secondNumber);
        System.out.println("Whole Number Division: " + firstNumber/secondNumber + " remainder " + firstNumber%secondNumber);

        System.out.println(String.format("Floating Point Division: %.2f", firstNumDouble/secondNumDouble));






    }


}
