import java.util.Scanner;

public class LargestNumber{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    int n = sc.nextInt();
    int lastDigit = 0;
    int large = 0;
    while (n>0) {
      lastDigit = n%10;
      if (lastDigit>large) {
        large = lastDigit;
      }
      n=n/10;
    }
    System.out.println(large);
    sc.close();
  }
}