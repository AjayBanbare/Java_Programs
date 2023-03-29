import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of test cases");
       int T = sc.nextInt();
       sc.nextLine(); // 

       for (int i = 0; i < T; i++) {
           String pattern = sc.nextLine();
           String text = sc.nextLine();
           boolean result = findPermutationInText(pattern, text);
           System.out.println(result ? "YES" : "NO");
       }
   }

   public static boolean findPermutationInText(String scribbledText, String text) {
       List<String> permutations = generatePermutations(scribbledText);
       for (String perm : permutations) {
           if (text.contains(perm)) {
               return true;
           }
       }
       return false;
   }

   public static List<String> generatePermutations(String str) {
       List<String> result = new ArrayList<>();
       generatePermutationsHelper(str.toCharArray(), 0, result);
       return result;
   }

   public static void generatePermutationsHelper(char[] arr, int index, List<String> result) {
       if (index == arr.length) {
           result.add(new String(arr));
       } else {
           for (int i = index; i < arr.length; i++) {
               swap(arr, index, i);
               generatePermutationsHelper(arr, index + 1, result);
               swap(arr, index, i);
           }
       }
   }

   public static void swap(char[] arr, int i, int j) {
       char temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }
}
