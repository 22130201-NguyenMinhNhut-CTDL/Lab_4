package Task_2;

import java.util.Random;

public class Task2_2 {
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = getPivot_MedianOfThree(array, left, right);
            int partitionIndex = partition(array, left, right, pivotIndex);

            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right, int pivotIndex) {
        int pivotValue = array[pivotIndex];
        swap(array, pivotIndex, right);

        int i = left;
        for (int j = left; j < right; j++) {
            if (array[j] >= pivotValue) {
                swap(array, i, j);
                i++;
            }
        }

        swap(array, i, right);
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Select pivot element based on the median of three strategy
    private static int getPivot_MedianOfThree(int[] array, int left, int right) {
        int mid = left + (right - left) / 2;
        if (array[left] > array[mid]) {
            swap(array, left, mid);
        }
        if (array[left] > array[right]) {
            swap(array, left, right);
        }
        if (array[mid] > array[right]) {
            swap(array, mid, right);
        }
        return mid;
    }

    // Select pivot element based on the first element in the array
    private static int getPivot_First(int[] array, int left, int right) {
        return left;
    }

    // Select pivot element based on the last element in the array
    private static int getPivot_Last(int[] array, int left, int right) {
        return right;
    }

    // Select pivot element based on choosing a random element in the array
    private static int getPivot_Random(int[] array, int left, int right) {
        Random rand = new Random();
        return left + rand.nextInt(right - left + 1);
    }

    public static void main(String[] args) {
        int[] arr = {11, 6, 5, 3, 7, 2, 1, 19, 4};
        quickSort(arr);

        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
