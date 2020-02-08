package io.dowlathbasha.datastructurecoding.array;
/*
*
*   @Author Dowlath Basha G
*
*/
import java.util.Arrays;

public class FindArraysAreEqualOrNot {
	public static void main(String args[]) {
		int[] a = { 1, 4, 2 };
		int[] b = { 1, 4, 2 };
		int[] c = { 1, 2, 4 };
		int[] d = { 1, 4, 2, 6 };
		arraysEqualOrNot(a, c);
		arraysEqualOrNot(a, b);
		arraysEqualOrNot(a, d);
	}

	private static void arraysEqualOrNot(int[] m, int[] n) {
		boolean result = Arrays.equals(m, n);
		System.out.println("The result ....: " + result);

	}
}
