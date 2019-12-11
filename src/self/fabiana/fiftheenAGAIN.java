package self.fabiana;

import java.util.Scanner;

public class fiftheenAGAIN {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please insert the number");
    int input = scan.nextInt();
    int result = getEvenDigictSum(input);
    System.out.println(result);
  }

  private static int getEvenDigictSum(int number) {
    String[] split = String.valueOf(number).split("");
    int acum = 0;
    for (int i = 0; i < split.length; i++) {
      String value = split[i];
      int iValue = Integer.parseInt(value);
      if (iValue % 2 == 0) {
        acum += iValue;
      }
    }
    return acum;
  }
}