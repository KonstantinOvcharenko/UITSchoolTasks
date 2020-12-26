package examples;

import java.util.Arrays;

public class App4 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		System.out.println(Arrays.binarySearch(arr, 5));
		System.out.println(Arrays.binarySearch(arr, 10));
		System.out.println(Arrays.binarySearch(arr, 15));
		System.out.println(Arrays.binarySearch(arr, 20));
		System.out.println(Arrays.binarySearch(arr, 25));
		System.out.println(Arrays.binarySearch(arr, 30));
		System.out.println(Arrays.binarySearch(arr, 35));
		System.out.println(Arrays.binarySearch(arr, 40));
		System.out.println(Arrays.binarySearch(arr, 45));

	}
}
