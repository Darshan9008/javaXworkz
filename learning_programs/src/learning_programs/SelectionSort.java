package learning_programs;

public class SelectionSort {

	public static void main(String[] args) {

		
		int arr[]= {2,67,87,99,566};
		System.out.println("unsorted array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length-1;i++) {
			int min_index=i;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[min_index]<arr[j]) {
					min_index=j;
				}
				
				int temp=arr[min_index];
				arr[min_index]=arr[j];
				arr[j]=temp;
				
				
				
			}
		}
		System.out.println("");
		System.out.println("sorted array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			
		
		
	}

}
