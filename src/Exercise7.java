import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Salary  : ");
        double salary = user_input.nextDouble( );
        System.out.print("401(k)  : ");
        double retirement = user_input.nextDouble( )/100;
        System.out.print("Federal : ");
        double federal = user_input.nextDouble( )/100;
        System.out.print("State   : ");
        double state = user_input.nextDouble( )/100;

        double netPay = salary - (salary*retirement);
        netPay = (netPay - (netPay*federal) - (netPay*state))/24;
        System.out.printf("\n$%,.2f.", netPay);
    }
}
