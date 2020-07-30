import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    while(true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Type in number of coins: ");
      int numOfCoins = scanner.nextInt();
      System.out.printf("The coins can form %d rows\r\n", arrangeCoins(numOfCoins));
    }
  }

  public static int arrangeCoins(int n) {
    int rows = 0;
    for(int i = 1; i <= n; i++) {
      n -= i;
      if(n >= 0) {
        rows++;
      } else {
          break;
      }
    }
    return rows;
  }
}