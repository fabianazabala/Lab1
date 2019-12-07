package self.fabiana;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class twelve {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("insert first decimal number");
    double firstNumberFromTheUser = scan.nextDouble();
    System.out.println("insert second decimal number");
    double secondNumberFromTheUser = scan.nextDouble();
    boolean result = areEqualByThreeDecimal(firstNumberFromTheUser, secondNumberFromTheUser);

    if (result) {
      System.out.println("numbers are equal");
    } else {
      System.out.println("numbers are different");
    }
  }

  private static boolean areEqualByThreeDecimal(double firstNumber, double secondNumber) {
    BigDecimal first = new BigDecimal(firstNumber).setScale(3, RoundingMode.HALF_EVEN);
    BigDecimal second = new BigDecimal(secondNumber).setScale(3, RoundingMode.HALF_EVEN);

    return first.equals(second);
  }
}
