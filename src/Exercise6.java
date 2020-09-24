import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Wage      : ");
        double wage = user_input.nextDouble( );
        System.out.print("Monday    : ");
        double monHour = user_input.nextDouble( );
        System.out.print("Tuesday   : ");
        double tuesHour = user_input.nextDouble( );
        System.out.print("Wednesday : ");
        double wedHour = user_input.nextDouble( );
        System.out.print("Thursday  : ");
        double thursHour = user_input.nextDouble( );
        System.out.print("Friday    : ");
        double fridayHour = user_input.nextDouble( );
        System.out.print("Saturday  : ");
        double satHour = user_input.nextDouble( );
        System.out.print("Sunday    : ");
        double sunHour = user_input.nextDouble( );

        double totalHours = monHour+tuesHour+wedHour+thursHour+fridayHour+satHour+sunHour;
        double totalMoney = totalHours*wage;
        System.out.printf("\n$%,.2f.", totalMoney);
    }
}
