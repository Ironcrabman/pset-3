import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Students : ");
        int students = user_input.nextInt( );
        System.out.print("Teachers : ");
        int teachers = user_input.nextInt( );
        System.out.print("Capacity : ");
        int capacity = user_input.nextInt( );

        double busNum = (students + teachers) / (double)capacity;
        double overflow = (capacity * ((((students + teachers - .5) % capacity) + .5) / (double)capacity)) + 0.0000000001;
        busNum += ((((capacity - (int) overflow) % capacity) / (double)capacity));
        busNum = (int) (busNum);
        overflow = (int) (overflow);

        System.out.printf("%n%-20s: %d", "Buses required", (int)busNum);
        System.out.printf("%n%-20s: %d", "Overflow passengers", (int)overflow);
    }
}
