public class InvertedRightTriangleStarPattern {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            int n=4;
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
