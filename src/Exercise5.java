import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Homework 1  : ");
        double hwOne = user_input.nextDouble( );
        System.out.print("Homework 2  : ");
        double hwTwo = user_input.nextDouble( );
        System.out.print("Homework 3  : ");
        double hwThree = user_input.nextDouble( );
        System.out.print("Quiz 1      : ");
        double quizOne = user_input.nextDouble( );
        System.out.print("Quiz 2      : ");
        double quizTwo = user_input.nextDouble( );
        System.out.print("Test 1      : ");
        double testOne= user_input.nextDouble( );
        double hw = ((hwOne + hwThree + hwTwo)/3)*0.15;
        double quiz = ((quizOne + quizTwo)/2)*0.35;
        double test = (testOne*0.5) + hw + quiz;
        System.out.printf("\n%,.2f%%.", test);
    }
}
