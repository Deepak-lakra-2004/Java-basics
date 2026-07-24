import java.util.Scanner;

public class M17_ConvertDecimalToBinary {
    public static int decimalToBinary(int n){
        int bin = 0;
        int rem = 0;
        for(int i=0; n>0; i++){
           rem = n%2;
           bin += (int)rem*Math.pow(10, i);
           n = n/2;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int n = sc.nextInt();
        System.out.println("Decimal of " + n + " = " + decimalToBinary(n));
        sc.close();
    }
}
