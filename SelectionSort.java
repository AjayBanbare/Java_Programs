public class SelectionSort {
    
    public static void main(String[] args) {
        System.out.println("selection sort");
        int [] a = {43,22,66,12,34,98,65};
        int min, temp;
        for(int i=0; i<a.length; i++){
            min = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
        temp = a[i];
        a[i] = a[min];
        a[min] = temp;
        }
    
    for(int i=0; i<a.length; i++){
        System.out.print(a[i] + " ");

    }
}
}
