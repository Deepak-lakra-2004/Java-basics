import java.util.*;
public class IncomeTaxCalculator{
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income:");
        float Income = sc.nextFloat();

        if(Income < 500000){
            System.out.println("Your income is tax free");
        }
        else if (Income > 500000 && Income < 1000000){
            System.out.println("20% tax deduct from your income ");
            System.out.println("income after deduction 20% tax:" + (Income -(Income*.20f)) );
        }
        else if(Income > 1000000){
            System.out.println("30% tax is deduct form your income");
            System.out.println("incme after deduction 30% tax:" + (Income - (Income*.30f)));
        }
        sc.close();
    }
}