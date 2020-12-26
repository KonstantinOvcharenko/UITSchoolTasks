package practice.labs_1;

import java.util.Arrays;

public class Lab_1_ArrayInverter {
	public static void invert(int[] arr) {
		for (int k = arr.length / 2 - 1; k >= 0; k--) {
			int tmp = arr[k];
			arr[k] = arr[arr.length - 1 - k];
			arr[arr.length - 1 - k] = tmp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(arr));
		invert(arr);
		System.out.println(Arrays.toString(arr));
	}
}
