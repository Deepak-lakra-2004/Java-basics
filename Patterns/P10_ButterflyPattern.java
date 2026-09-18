public class P10_ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;
        //1st Half
        for(int i=1; i<=n; i++){

            //Left Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //Middle Spaces
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }

            //Right Stars
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half
        for(int i=n; i>=1; i--){

          //Left Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //Middle Spaces
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            
            //Right Stars
            for(int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}
