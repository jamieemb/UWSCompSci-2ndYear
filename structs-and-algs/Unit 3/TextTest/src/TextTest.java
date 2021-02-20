public class TextTest {

    public static void main (String[] args){

        // Take a string
        String string = Input.getString("Enter a sentence: ");

        // Break it into its component words and add to an array
        String[] split = string.split("\\s+");

        // Output each array position and the number of elements that are stored within the array
        for (String s : split) {
            System.out.println(s);
        }
        System.out.printf("number of words: %d", split.length);
    }
}
