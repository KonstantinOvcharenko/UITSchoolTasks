package practice.labs_1;

import java.util.Arrays;

public class Lab_3_Invert_Bubble {
	public static void invert_bubble(int[] arr) {
		for (int barrier = 0; barrier < arr.length; barrier++) {
			for (int index = arr.length - 1; index > barrier; index--) {
				if (arr[index] < arr[index - 1]) {
					int tmp = arr[index - 1];
					arr[index - 1] = arr[index];
					arr[index] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 9, 7, 6, 4, 3, 8, 1, 0 };
		invert_bubble(arr);
	}
}
