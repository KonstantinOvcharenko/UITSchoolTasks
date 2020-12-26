package practice.labs_1;

import java.util.Arrays;

public class Lab_4_Selection_Sort {
	public static void sort(int[] arr) {
		for (int barrier = 0; barrier < arr.length - 1; barrier++) {
			int min = arr[barrier];
			int min_Index = barrier;
			for (int index = barrier + 1; index < arr.length; index++) {
				if (arr[index] < min) {
					min = arr[index];
					min_Index = index;
				}
			}
			arr[min_Index] = arr[barrier];
			arr[barrier] = min;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 6, 5, 3, 4, 1, 7, 0, 2 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
