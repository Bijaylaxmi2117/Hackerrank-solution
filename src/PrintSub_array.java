import java.util.*;
public class PrintSub_array {
	static int arr[]=new int[] {1,2,3};
	
    static void subArray(int n){
		for(int i=0; i<n; i++) {
			for(int j=i; j<n;j++) {
				for(int k=i; k<=j; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String [] args) {	
		System.out.println("All Non-empty subarrays are: ");
		subArray(arr.length);
	
}
}