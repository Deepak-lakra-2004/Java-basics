import java.util.*;
public class PrimeNumberChecker{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = sc.nextInt();

    boolean isPrime = true;
    if (n <=1) {
      System.out.println("Not prime!");  // by this condition 1 and negitive number is not show as prime 
      
    }
    else if (n==2) {
      System.out.println("Prime number!");
    }else{
      for(int i=2; i<=Math.sqrt(n); i++){  // math.sqrt = underroot n
      if (n%i==0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime == true) {
      System.out.println("Prime number!");
    }else
      System.out.println("Not prime!");
    }
    sc.close();
  }
}