import java.lang.Math;

public class RadiusTest {



    public static void main (String[] args){

        // Variable declarations and calculations
        double pi = 3.142;
        double radius = Input.getDouble("What is the radius of the circle? >> ");
        double circumference = (2*(pi)*radius);
        double area = pi * (Math.pow(radius, 2));
        double volume = (4.0/3.0*(pi*(Math.pow(radius, 3))));

        // Displaying outputs
        System.out.println(String.format("Circumference: %.3f", circumference));
        System.out.println(String.format("Area: %.4f", area));
        System.out.println(String.format("Volume: %.14f", volume));

    }
}
