import java.util.Scanner;
public class M06_ProductOfTwoNumbers{
    public static int product(int a , int b  ){
        return a*b;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a = sc.nextInt();
    System.out.println("Enter the value of b:");
    int b = sc.nextInt();

    int result = product(a, b);
    System.out.println("The product of a and b is:" + result);
    sc.close();
}
}