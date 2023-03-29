public class BinarySearch {
    
    public static void main(String[] args) {
        System.out.println("Binary search");
		int [] a = {1,3,5,7,13,16,19,34,37,39};
		int srch = 70;
		int li = 0;
		int hi = a.length - 1;
		int mi = (li+hi)/2;
	while(li<=hi){	
		if(a[mi] == srch){
		    System.out.println("element is at index position " + mi);
		    break;
		}else if(a[mi] < srch){
		    li = mi+1;
		}else{
		    hi = mi-1;
		}
		mi = (li+hi)/2;
	}
    if(li>hi){
        System.out.println("element not found");
    }
    }
}
