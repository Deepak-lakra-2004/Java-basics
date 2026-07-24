import java.util.Scanner;

public class M14_MethodOverloadingMaxNumber {
    public static int max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>c){
            return b;
        }else{
            return c;
        }
    }
    public static double max(double a, double b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();
        System.out.println("Enter the value of x:");
        double x = sc.nextDouble();
        System.out.println("Enter the value of y:");
        double y = sc.nextDouble();

        System.out.println("Lagest of two is:"+ max(a ,b));
        System.out.println("Lagrest of three is:"+ max(a ,b ,c));
        System.out.println("Largest of two float is:"+ max(x, y));
        sc.close();
    }
}
