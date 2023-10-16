package Task_1;

public class Task1_3 {
	public static void insertionSort(int[] array) {
		int n = array.length;

		for (int i = 1; i < n; i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] < key) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 4, 5, 2, 9, 11, 7 };
		insertionSort(arr);

		System.out.println("Sorted array in descending order:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
