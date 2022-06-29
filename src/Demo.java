/* Print the number of subarrays of array having negative sums.*/

import java.io.*;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int sum=0;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);

	}

}
