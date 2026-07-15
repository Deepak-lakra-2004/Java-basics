import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        System.out.println("Select an oprator:");
        char calculator = sc.next().charAt(0);
        switch (calculator) {
            case '+':
                System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;
        
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;

            default:
                System.out.println("Invalid oprator");
                break;
        }
        sc.close();
    }
}
