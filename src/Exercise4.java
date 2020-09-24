import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Height : ");
        double height = user_input.nextDouble( );
        System.out.print("Width  : ");
        double width = user_input.nextDouble( );
        width = width*2.54;
        height = height*2.54;
        double peri = (width+height)*2;
        System.out.printf("\n%,.2f centimeters.", peri);
    }
}
