import java.util.Scanner;

public class M20_IsANumberPalindrome {
    public static boolean isANumberPalindrome(int n){
        int rev = 0;   // rev = reverse
        int ld = 0;  // ld = last digit
        int original = n;
        while (n>0) {
            ld = n%10;
            rev = rev*10 + ld;
            n = n/10;
        }
        return (original == rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Is the number palindrome : "+isANumberPalindrome(n));
        sc.close();
    }
}
