package io.dowlathbasha.datastructurecoding.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 *
 *   @Author Dowlath Basha G
 *
*/

public class NoOfOccurancesGivenString {
	public static void main(String args[]) {
		int[] a = { 1, 3, 2, 1, 4 };
		noOfOccurances(a);
	}

	private static void noOfOccurances(int[] a) {
		Map<Integer, Integer> occuranceMap = new HashMap<Integer, Integer>();
		for (int i : a) {
			if (occuranceMap.containsKey(i)) {
				occuranceMap.put(i, occuranceMap.get(i) + 1);
			} else {
				occuranceMap.put(i, 1);
			}
		}
		
		System.out.println("Input ... :" + Arrays.toString(a));
		System.out.println("Occurances ... :" + occuranceMap);
	}
}
