import java.util.Scanner;

public class M18AverageOf3Numbers {
    public static int average(int a, int b, int c){
        int avg = (a+b+c)/3;
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
        System.out.println("The average of "+a+" "+b+" "+c+" is : "+average(a, b, c));
        sc.close();
    }
}
