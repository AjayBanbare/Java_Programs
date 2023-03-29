import java.util.Scanner;

public class SumOfNaturalNumber {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the natural number to print sum of that number");
        int n = sc.nextInt();
        sc.close();

        System.out.println( n*(n+1)/2 );
    }
}
