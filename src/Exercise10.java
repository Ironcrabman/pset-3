import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Fahrenheit : ");
        double fahren = user_input.nextDouble( );

        double celsius = (fahren-32)*5/9;
        double kelvin = (celsius + 273.15);

        System.out.printf("%n%-9s: %,.2f", "Celsius", celsius);
        System.out.printf("%n%-9s: %,.2f", "Kelvin", kelvin);

    }
}
