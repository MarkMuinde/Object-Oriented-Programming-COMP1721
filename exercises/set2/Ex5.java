import java.util.*;
class Ex5 {
  public static void main(String[] args) {
    double fahrenheit, celsius = 0;
    System.out.println ("+-----------+----------+");
    System.out.println ("|     \u00b0C    |   \u00b0F     |");
    System.out.println ("+-----------+----------+");
    while (celsius<=36) {
      fahrenheit =(9.0/5.0 * celsius) + 32;
      System.out.print("|    ");
      System.out.printf("%5.1f",celsius);
      System.out.print("  |    ");
      System.out.printf("%5.1f",fahrenheit);
      System.out.print(" | ");
      System.out.println();
      celsius+=2;
    }
  }
}