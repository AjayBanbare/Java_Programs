public class BubbleSort {
    
    public static void main(String[] args) {
        System.out.println("bubble Sort");
        int [] a = {43,22,66,12,34,98,65};
        int temp;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-1; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");

        }
    }
}
