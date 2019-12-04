package self.fabiana;

import java.util.Scanner;

public class FirstExercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please insert the first number");
        int firstNumber = scan.nextInt();
        System.out.println("please insert the second number");
        int secondNumber = scan.nextInt();
        int sum = firstNumber + secondNumber;

        System.out.println("The result of sum is = " + sum);
    }
}
