package self.fabiana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eleventh {
  public static void main(String[] args) {
    Scanner askNumbers = new Scanner(System.in);
    double input = 0.0;
    List<Double> numbers = new ArrayList<>();
    do {
      System.out.println("Enter a value, input -99 to finish");
      input = askNumbers.nextDouble();
      numbers.add(input);
    } while (input != -99);
    System.out.println(calculateAverage(numbers));
  }

  static double calculateAverage(List<Double> numbers) {
    double total = 0;
    int amountOfNumbers = numbers.size();
    for (Double number : numbers) {
      total += number;
    }
    return total / amountOfNumbers;
  }
}
