public class P13_DiamondPattern {
    public static void main(String[] args) {
        int n = 4;

        //1 Hlaf
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2 Half
        for(int i=n; i>=1; i--){
            //Spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
