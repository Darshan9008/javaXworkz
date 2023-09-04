package learning_programs;

public class binary_search {

	public static void  binarySearch(int[] arr,  int key) {
		
		int low=0 , high=arr.length-1, mid=0;
		
		while(low<=high) {
			
			mid = (low+high)/2;
			if(key==arr[mid]) {
				System.out.println( "element found at the pos"+mid);
				break;
				
			}
			else if(key<arr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
			
		
		}
	
	}
	public static void main(String[] args) {
		
		
		int arr[]= {20,30,40,50,60,70};
		int key=60;
		binarySearch(arr, key);
		
		 
		
		
		
		
		
		
		
	}


}
