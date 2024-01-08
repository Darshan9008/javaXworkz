package learning_programs;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 12, 31, 6, 8, 21, 54 };
		int length = arr.length;

		System.out.println("unsorted array :");
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " "); // dont use println use print instead of ln

		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {  ///use key here not arr[i]

				arr[j + 1] = arr[j];
				j=j-1;
			}
			arr[j + 1] = key;

		}
		System.out.println();

		System.out.println("sorted array :");
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " "); // use print dont use ln while printing the array

	}

}
