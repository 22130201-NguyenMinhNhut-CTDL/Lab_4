package Task_1;

public class Task1_2 {
	public static void bubbleSort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 4, 5, 2, 9, 11, 7 };
		bubbleSort(arr);

		System.out.println("Sorted array in descending order:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
