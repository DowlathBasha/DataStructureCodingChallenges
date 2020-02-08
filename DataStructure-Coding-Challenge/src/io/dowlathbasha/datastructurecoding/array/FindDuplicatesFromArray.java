package io.dowlathbasha.datastructurecoding.array;
/*
*
*   @Author Dowlath Basha G
*
*/
import java.util.HashSet;

public class FindDuplicatesFromArray {
	public static void main(String arg[]) {
		int[] a = { 2, 8, 1, 7, 4, 2, 9, 8 };
		findDuplicates(a);
	}

	private static void findDuplicates(int[] a) {
		int minimum = -1;
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < a.length - 1; i++) {
			if (hashSet.contains(a[i])) {
				minimum = i;
			} else {
				hashSet.add(a[i]);
			}
		}

		if (minimum != -1) {
			System.out.println("The Duplicate value is .... :" + a[minimum]);
		}
	}
}
