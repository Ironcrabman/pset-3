import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Amount : ");
        double amount = user_input.nextDouble( );

        int quarter = (int) ((amount-amount%0.25)/0.25);
        amount -= quarter*0.25;
        int dime = (int) ((amount-amount%0.10)/0.10);
        amount -=dime*0.10;
        int nickel = (int) ((amount-amount%0.05)/0.05);
        amount -=nickel*0.05;
        int penny = (int) (amount*100);

        System.out.printf("%n%-9s: %d", "Quarters", quarter);
        System.out.printf("%n%-9s: %d", "Dimes", dime);
        System.out.printf("%n%-9s: %d", "Nickels", nickel );
        System.out.printf("%n%-9s: %d", "Pennies", penny);


    }
}
