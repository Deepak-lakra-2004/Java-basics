import java.util.Scanner;

public class smallDigit{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    int n = sc.nextInt();
    int lastDigit = 0;
    int smallest = 9; //I write here 9 because if i write here 0 then it show 0 as output
    while (n>0) {
      lastDigit = n%10;
      if (lastDigit<smallest) {
        smallest = lastDigit;
      }
      n=n/10;
    }
    System.out.println(smallest);
    sc.close();
  }
}