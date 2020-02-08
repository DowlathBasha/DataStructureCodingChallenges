package io.dowlathbasha.datastructurecoding.array;

import java.util.Arrays;

/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int[] a = {12,11,12,8,2,1,90,1,11};
		removeDuplicates(a);
	}
	
	private static void removeDuplicates(int[] a) {
		int length = a.length;
		for( int i = 0;i<length;i++) {
			for( int j = i+1; j<length;j++) {
				if(a[i] == a[j]) {
					a[j] = a[length-1];
					length--;
					j--;
				}
			}
		}
		System.out.print("Given elements ... :" + Arrays.toString(a));
		int[] arrayWithOutDuplicates = Arrays.copyOf(a, length);
		System.out.print("\n\nUnique elements ... :" + Arrays.toString(arrayWithOutDuplicates));
	}

}
