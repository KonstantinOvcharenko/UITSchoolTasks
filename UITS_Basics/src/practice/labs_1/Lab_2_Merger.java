package practice.labs_1;

import java.util.Arrays;

public class Lab_2_Merger {
	public static int[] merge(int[] fst, int[] snd) {
		int[] result = new int[fst.length + snd.length];
		int fstIndex = 0;
		int sndIndex = 0;
		int k = 0;
		while (k < result.length) {
			result[k] = fst[fstIndex] < snd[sndIndex] ? fst[fstIndex++] : snd[sndIndex++];
			if (fstIndex == fst.length) {
				System.arraycopy(snd, sndIndex, result, ++k, snd.length - sndIndex);
				break;
			}
			if (sndIndex == snd.length) {
				System.arraycopy(fst, fstIndex, result, ++k, fst.length - fstIndex);
				break;
			}
			k++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] frst = { 1, 2, 3, 4, 5 };
		int[] scnd = { 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(merge(frst, scnd)));
	}
}
