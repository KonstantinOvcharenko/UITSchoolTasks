package practice.task_1;

import java.util.Random;
import java.util.Scanner;

public class Exercise_3 {
	public static void main(String[] args) {
		System.out.print("Enter number of random values: ");
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		scan.close();
		Random rand = new Random(System.currentTimeMillis());
		for (int i = 0; i < n; i++) {
			System.out.println(rand.nextInt(11));
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(rand.nextInt(11) + " ");
		}
	}
}
