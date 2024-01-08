package learning_programs;

import java.util.Arrays;

public class SecondLargestElement {

	public static void secLargest(int arr[]) {
		
		int size=arr.length;
		if(size<2) {
			System.out.println("invalid input");
		}
		else {
			
			Arrays.sort(arr);                                       //using Arrays we are sorting inbuilt sort method
			System.out.println("second largest element :"+arr[size-2]);
		
			
		}
		
	}
	public static void main(String[] args) {
		
		
		int arr[]= {2,78,54,76,34,25};
		SecondLargestElement.secLargest(arr);
	}
	
	
}
