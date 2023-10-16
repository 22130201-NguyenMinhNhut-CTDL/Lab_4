package Task_1;

public class Task1_1 {
	public static void selectionSort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			int maxIndex = i;

			for (int j = i + 1; j < n; j++) {
				if (array[j] > array[maxIndex]) {
					maxIndex = j;
				}
			}

			int temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 4, 5, 2, 9, 11, 7 };
		selectionSort(arr);

		System.out.println("Sorted array in descending order:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
