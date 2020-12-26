package practice.labs_1;

import java.util.Arrays;

public class Lab_5_Insertion_Sort {
	public static void sort(int[] arr) {
		for (int k = 1; k < arr.length; k++) {
			int newElement = arr[k];
			int location = Arrays.binarySearch(arr, 0, k, newElement);
			if (location < 0) {
				location = ~location;
			}
			System.arraycopy(arr, location, arr, location + 1, k - location);
			arr[location] = newElement;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 6, 5, 3, 4, 1, 7, 0, 2 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
