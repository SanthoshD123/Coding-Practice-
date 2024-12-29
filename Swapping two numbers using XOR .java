public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5; 
        int b = 10; 

        System.out.println("Original a: " + a);
        System.out.println("Original b: " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Swapped a: " + a);
        System.out.println("Swapped b: " + b);
    }
}
