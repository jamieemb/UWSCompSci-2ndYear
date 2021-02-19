public class Task4 {

    public static void main (String[] args) {

        double feet = Input.getDouble("feet: ");
        double inches = Input.getDouble("inches: ");
        double totalInches = feet * 12 + inches;
        double totalCm = totalInches * 2.54;

        double meters = totalCm / 100;
        int metersInt = (int) meters;

        double centimeters = totalCm % 100 + 0.5;
        int centimetersInt = (int) centimeters;

        System.out.println(String.format("%dm %dcm", metersInt, centimetersInt));






    }




}
