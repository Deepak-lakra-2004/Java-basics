import java.util.*;
public class TernaryOperatorExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        String type = ((num%2) == 0)? "even" : "odd";
        System.out.println(type);
        sc.close();
    }
}
