package self.fabiana;

public class fourteen {

  public static void main(String[] args) {
  }

  private static int sumFirstAndLastNumber(int number) {
    String[] split = String.valueOf(number).split("");
    int first = Integer.parseInt(split[0]);
    int last = Integer.parseInt(split[split.length - 1]);
    return first + last;
  }
}
