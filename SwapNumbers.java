public class SwapNumbers {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
            //with using third variable
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

            //without using third variable
        int x = 30;
        int y = 60;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y); 
    }
}
