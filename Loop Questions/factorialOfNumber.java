import java.util.*;
public class factorialOfNumber{
  public static void main(String[] args) {
    try (Scanner sc= new Scanner(System.in)){
    System.out.println("Enter the value of n:");
    int n = sc.nextInt();
    if (n<0) {
      System.out.println("Factorial is not defined for negative numbers!");
      return;
    }
    int fact = 1;
    for(int i = 1; i<=n; i++){
      fact = fact*i;
    }
      System.out.println("factorial of " + n + " is:" + fact );    
    }
  }
}