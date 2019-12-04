package self.fabiana;

import java.util.Scanner;

public class fourthExercise {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please insert the number");
    int firstNumber = scan.nextInt();

    if (firstNumber % 2 == 0) {
      System.out.println("That number is even");
    } else {
      System.out.println("That number is odd");

    }

  }

}
