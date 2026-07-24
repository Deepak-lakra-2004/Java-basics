import java.util.Scanner;

public class M12_MethodOverloadingCalculator {
    public static int calculate(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int calculate(int a, int b, int c){
        int product = a*b*c;
        return product;
    }
    public static double calculate(double a, double b){
        double avg = (a+b)/2;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();

        System.out.println("Enter the value of A:");
        double A = sc.nextDouble();
        System.out.println("Enter the value of B:");
        double B = sc.nextDouble();

        System.out.println("The sum is: "+ calculate(a, b));
        System.out.println("The product is: "+ calculate(a, b, c));
        System.out.println("The average is: "+ calculate(A, B));
        sc.close();
    
    }
}

