package io.dowlathbasha.datastructurecoding.array;

public class Arrange0sAND1s {
	public static void main(String args[]) {
		int[] a = { 1, 1, 1, 0, 0, 1, 1, 0 };
		arrangeOrder(a);
		for(int order : a) {
			System.out.print(" "+ order);
		}
	}

	private static void arrangeOrder(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int left = 0;
			int right = a.length - 1;

			while (a[left] == 0) {
				left++;
			}

			while (a[right] == 1) {
				right--;
			}

			if (left < right) {
				int tmp = a[left];
				a[left] = a[right];
				a[right] = tmp;
			}
		}

	}
}
