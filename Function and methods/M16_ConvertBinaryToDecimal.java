import java.util.Scanner;

public class M16_ConvertBinaryToDecimal {
    public static int binaryToDecimal(int n){
        int dec = 0;
        int ld = 0;
        for(int pow=0; n>0; pow++){
            ld = n%10;
            dec = dec + (ld * (int)Math.pow(2,pow)); //// Type casting is used because Math.pow() returns a double value.
            n = n/10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int n = sc.nextInt();
        System.out.println("The decimal of "+ n + " = " + binaryToDecimal(n));
        sc.close();
    }
}
