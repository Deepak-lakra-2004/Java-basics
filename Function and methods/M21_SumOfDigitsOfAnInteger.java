import java.util.Scanner;

public class M21_SumOfDigitsOfAnInteger {
    public static int sumOfDigitsOfAnInteger(int n){
        int sum = 0;
        while (n>0) {
            int ld = n%10;
            sum += ld;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vlaue of n:");
        int n = sc.nextInt();
        System.out.println("The Sum of digits of an interger is : "+ sumOfDigitsOfAnInteger(n));
        sc.close();
    }
}
