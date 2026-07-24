public class M05_CallByValue {
    public static void Swap(int a , int b ){
        //Swaping the value - means exchanging the value
        int temp = a;
        a = b;
        b = temp;  
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        Swap(a,b);
        System.out.println("value of a:" + a);
        System.out.println("value of b:" + b);
    }
}

// Java uses call by value.
// The Swap() method receives copies of 'a' and 'b'.
// Swapping these copies does not change the original variables in main().
// Therefore, after the method ends, the original values remain unchanged.