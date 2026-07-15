import java.util.*;
public class PrintTableOfNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            for(int i=1; i<=10; i++){
                System.out.println(n + "x" + i + "=" + (i*n));
            }
        }
    }
}
