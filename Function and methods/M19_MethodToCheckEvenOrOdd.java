import java.util.Scanner;

public class M19_MethodToCheckEvenOrOdd {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Is the number Even : " + isEven(n));
        sc.close();
    }
}
