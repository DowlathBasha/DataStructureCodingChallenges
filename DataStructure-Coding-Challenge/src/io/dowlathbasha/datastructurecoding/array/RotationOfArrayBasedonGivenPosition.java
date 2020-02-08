package io.dowlathbasha.datastructurecoding.array;

public class RotationOfArrayBasedonGivenPosition {
      public static void main(String args[]) {
    	  int[] a = {201,43,12,55};
    	  int givenPosition = 3; 
    	  rotateArray(a,givenPosition);
    	  for(int m : a) {
    		  System.out.print(" "+m);
    	  }
    	  
      }
	
      private static void rotateArray(int[] a, int n) {
    	  for(int i=0;i<n ; i++) {
    		  for(int j=a.length-1;j>0;j--) {
    			  int temp = a[j];
    			  a[j] = a[j-1];
    			  a[j-1] = temp;
    		  }
    	  }    	  
      }
}
