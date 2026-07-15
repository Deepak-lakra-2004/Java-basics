import java.util.*;
public class javabasics{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();

        int sum = a+b+c ;
        System.out.println("Average is:" + sum/3);
        sc.close();
    }
}                   