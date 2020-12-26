package examples;

import java.util.Arrays;

public class ArrayCopyExample2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(arr));

		System.arraycopy(arr, 1, arr, 3, 3);
		System.out.println(Arrays.toString(arr));
	}
}
