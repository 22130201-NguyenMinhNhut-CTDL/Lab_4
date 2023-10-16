package Task_2;

import java.util.Arrays;

public class Task2_1 {
	public static void mergeSort(int[] array) {
		if (array.length <= 1) {
			return;
		}
		int mid = (array.length / 2);
		int[] leftHalf = new int[mid];
		int[] rightHalf = new int[array.length - mid];

		for (int i = 0; i < mid; i++) {
			leftHalf[i] = array[i];
		}
		for (int i = mid; i < array.length; i++) {
			rightHalf[i - mid] = array[i];
		}
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		merge(array, leftHalf, rightHalf);
	}

	private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < leftHalf.length && j < rightHalf.length) {
			if (leftHalf[i] >= rightHalf[j]) {
				array[k] = leftHalf[i];
				i++;
			} else {
				array[k] = rightHalf[j];
				j++;
			}
			k++;
		}

		while (i < leftHalf.length) {
			array[k] = leftHalf[i];
			i++;
			k++;
		}
		while (j < rightHalf.length) {
			array[k] = rightHalf[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] array = { 2, 9, 5, 6, 1, 8, 7, 4, 3 };
		mergeSort(array);

		System.out.println(Arrays.toString(array));
	}
}
