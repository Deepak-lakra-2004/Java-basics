import java.util.Scanner;

public class M13_MethodOverloadingAreaCalculator {
    public static int area(int side){
        int area = side*side;
        return area;
    }
    public static int area(int length, int breadth){
        int area = length*breadth;
        return area;
    }
    public static double area(double radius){
        double area = 3.14*radius*radius;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side:");
        int side = sc.nextInt();
        System.out.println("Enter the value of length:");
        int length = sc.nextInt();
        System.out.println("Enter the value of breadth:");
        int breadth = sc.nextInt();
        System.out.println("Enter the value of radius:");
        double radius = sc.nextDouble();

        System.out.println("The area of square is :"+ area(side));
        System.out.println("The area of rectange is :"+ area(length, breadth));
        System.out.println("The area of circle is :"+ area(radius));
        sc.close();
    }
}
