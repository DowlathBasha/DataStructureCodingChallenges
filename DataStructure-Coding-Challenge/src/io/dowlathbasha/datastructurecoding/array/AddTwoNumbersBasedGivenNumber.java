package io.dowlathbasha.datastructurecoding.array;
/*
*
*   @Author Dowlath Basha G
*
*/
public class AddTwoNumbersBasedGivenNumber {
	public static void main(String arsgs[]) {
		int[] a = { 2, 9, 7, 11 };
		int x = 9;
		addTwoNumbers(a, x);

	}

	private static void addTwoNumbers(int[] a, int x) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == x) {
					System.out.println(i + "........" + j);
				}
			}
		}
	}
}