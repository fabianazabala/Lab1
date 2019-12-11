package self.fabiana;

public class fiftheen {
  public static void main(String[] args) {

    System.out.println(getEvenDigictSum(12));
  }

  private static int getEvenDigictSum(int number) {
    int temp = 0;
    for (int i = 0; i <= number; i += 2) {
      temp += i;
    }
    return temp;
  }
}