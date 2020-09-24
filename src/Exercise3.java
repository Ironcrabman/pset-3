import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Height : ");
        double height = user_input.nextDouble( );
        System.out.print("Width  : ");
        double width = user_input.nextDouble( );
        width = width*25.4;
        height = height*25.4;
        double area = width*height;
        System.out.printf("\n%,.2f square millimeters.", area);
    }
}
