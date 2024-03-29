package self.fabiana;

public class thirteen {
  public static void main(String[] args) {
    System.out.println(getDaysInMonth(2, 1980));
  }


  private static boolean isLeapYear(int year) {
    if (year < 1) {
      return false;
    } else if (year > 9999) {
      return false;
    }
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }

  private static int getDaysInMonth(int month, int year) {
    if (month < 1 || month > 12) {
      return -1;
    }
    if (year < 1 || year > 9999) {
      return -1;
    }
    switch (month) {
      case 1:
      case 7:
      case 5:
      case 3:
      case 8:
      case 10:
      case 12:
        return 31;
      case 2:
        if (isLeapYear(year)) {
          return 28;
        } else {
          return 29;
        }
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      default:
        throw new RuntimeException("this cannot happen");
    }
  }
}