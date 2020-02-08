package io.dowlathbasha.datastructurecoding.array;
/*
*
*   @Author Dowlath Basha G
*
*/
public class FindDuplicateStringFromGivenArray {
	public static void main(String args[]) {
        	String[] a = {"I" , "am","Not","I","Fool"} ;
        	  findDuplicateString(a);
        	}
	private static void findDuplicateString(String[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i].equals(a[j])) && (i!=j)) {
					System.out.println("Duplicate String ... :" + a[j]);
				}
			}
		}
	}
}
