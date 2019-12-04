package self.fabiana;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class SecondExercise {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("please insert the first number");
    BigDecimal firstNumber = scan.nextBigDecimal();
    System.out.println("please insert the second number");
    BigDecimal secondNumber = scan.nextBigDecimal();
    BigDecimal quotient = firstNumber.divide(secondNumber, 3, RoundingMode.DOWN);

    System.out.println("The result of the division is = " + quotient);
  }
}
