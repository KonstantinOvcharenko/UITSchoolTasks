package examples;

import java.util.Arrays;

public class App2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		int pos = Arrays.binarySearch(arr, 20);
		System.out.println(pos);
	}
}
