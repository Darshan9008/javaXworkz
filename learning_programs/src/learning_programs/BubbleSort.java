package learning_programs;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr= {5,9,2,32,21,19};
		int length=arr.length;
		
		System.out.println("unsorted elements:");
		for(int i=0;i<length;i++) 
			System.out.print(arr[i]+" ");
		
		for(int i=0;i<length;i++) {
			
			for(int j=1;j<length-i;j++) {
				
				if(arr[j-1]>arr[j]) {
					
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("bubble sorted elements:");
		for(int  i=0;i<length;i++) 
			System.out.print(arr[i]+" ");
		
		
		
	}

	}
