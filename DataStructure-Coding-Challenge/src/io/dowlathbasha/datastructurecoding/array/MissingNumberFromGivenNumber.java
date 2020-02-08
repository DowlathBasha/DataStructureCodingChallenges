package io.dowlathbasha.datastructurecoding.array;
/*
*
*   @Author Dowlath Basha G
*
*/
public class MissingNumberFromGivenNumber {
      public static void main(String args[]) {
    	  int[] a = { 4,1,6,3,2};
    	  missingNumber(a);
      }
      
      private static void missingNumber(int[] a) {
    	  int n = a.length+1;
    	  int totalNum = n*(n+1)/2;
    	  int sum =0;
    	  for(int i=0;i<a.length;i++) {
    		  sum+=a[i];
    	  }
    	  
    	  int result = totalNum - sum;
    	  System.out.println("Missing Number ... :"+result);
      }
}
