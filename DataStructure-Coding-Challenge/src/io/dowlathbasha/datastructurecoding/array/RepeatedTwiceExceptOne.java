package io.dowlathbasha.datastructurecoding.array;
/*
 *
 *   @Author Dowlath Basha G
 *
 *   There is an array with every element repeated twice except one. 
     As an example consider [1, 1, 2, 3, 3, 5, 5] and the element 2
*/

public class RepeatedTwiceExceptOne {
	public static void main(String args[]) {
		int[] a = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
		int length = a.length;
		int result = findExceptOne(a, length);
		System.out.println("Expect  ....:" + result);
	}

	private static int findExceptOne(int[] a, int length) {
		int res = a[0];
		for (int i = 1; i < length; i++) {
			res = res ^ a[i];
		}
		return res;
	}

}
