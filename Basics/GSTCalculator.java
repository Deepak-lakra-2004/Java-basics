import java.util.*;
public class GSTCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil:");
        float pencil = sc.nextFloat();
        System.out.println("Entr the price of pen:");
        float pen = sc.nextFloat();
        System.out.println("Enter the price of eraser:");
        float eraser = sc.nextFloat();

        float totalPrice = (pencil + pen + eraser);
        float bill = totalPrice + (totalPrice*.18f);
        System.out.println("Total bill is:" + bill);
        sc.close();
    }
}
