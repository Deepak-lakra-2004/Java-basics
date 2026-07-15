import java.util.Scanner;

public class breakStatementQuestion{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    while (true) {
      System.out.println("Enter the value of n:");
      int n = sc.nextInt();
      if (n % 10 == 0) {
        break;
      }
      System.out.println(n);
    }
    System.out.println("you are out of the loop!");
    sc.close();
  }
}