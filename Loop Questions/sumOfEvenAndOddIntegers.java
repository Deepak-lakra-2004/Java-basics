import java.util.*;
public class sumOfEvenAndOddIntegers{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("How many number you wnat to enter:");
    int num = sc.nextInt();
    int evenSum = 0;
    int oddSum = 0;
    for(int i =1; i<=num; i++){
      System.out.println("Enter number " + i + ":");
      int n = sc.nextInt();
      if (n%2==0) {
      evenSum += n;
      }else{
        oddSum += n;
      }
    }
    System.out.println("The sum of even number is:" + evenSum);
    System.out.println("The sum of odd number is:" + oddSum);
    sc.close();
  }
}