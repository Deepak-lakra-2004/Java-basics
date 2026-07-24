import java.util.Scanner;

public class M04_ParametersVsArgumetns{
    public static int add (int num1 , int num2){  //Parameters or formal parameter
        return num1 + num2;
    }
    public static void main(String[] ags){  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value b:");
        int b = sc.nextInt();
        int sum = add(a,b);                       // Argument or actual parameter
        System.out.println("the sum is :" + sum);
        sc.close();
    }
}