

public class ChangeCounterTest {


    public static void main (String[] args){

        int total=0;

        // Outputs
        int [] coinsNames = {50,20,10,5,2,1};

        // Loop for inputs
        for (int coinsName : coinsNames) {
            int temp = Input.getInteger("How many " + coinsName + "p coins? >> ");
            total += temp * coinsName;

        }
        System.out.printf("Pounds: %d Pence: %d%n", total/100, total%100);
    }
}
