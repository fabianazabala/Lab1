package self.fabiana;

import java.util.Scanner;

public class Tenth {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println(smallestNumber(5, 6));
  }


  static int smallestNumber(int firstNumber, int secondNumber) {
    if (firstNumber > secondNumber) {
      return secondNumber;
    } else if (secondNumber > firstNumber) {
      return firstNumber;
    } else {
      return firstNumber;
    }
  }
}

