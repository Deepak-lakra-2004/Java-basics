public class P11_SolidRhombusPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");  // To print space
            }
            for(int k=1; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
