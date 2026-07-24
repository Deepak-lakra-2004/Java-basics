import java.util.Scanner;

public class M09_MethodOverLoading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();

        System.out.println("Sum is :" + sum(a ,b));
        System.out.println("Sum is :" + sum(a ,b ,c));
        sc.close();
    }
}
