public class M10_MethodOverLoading{
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Sum is:" + sum(20, 32));
        System.out.println("Sum is:" + sum(20.5f, 56.4f));
    }
}