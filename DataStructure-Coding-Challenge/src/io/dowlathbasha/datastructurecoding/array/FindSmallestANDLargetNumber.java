package io.dowlathbasha.datastructurecoding.array;

public class FindSmallestANDLargetNumber {
    public static void main(String args[]) {
    	int[] a = {200,12,2,900,0};
    	findSmallestLargest(a);
    }
    
    private static void findSmallestLargest(int[] a) {
    	int smallest = a[0];
    	int largest = a[0];
    	
    	for(int i=0;i<a.length;i++) {
    		if(a[i] < smallest) {
    			smallest = a[i];
    		}
    		else if( a[i] > largest) {
    			largest = a[i];
    		}
    	}    	
    	System.out.println("Smallest ... : "+ smallest +"  " + "Largest ...: "+ largest);
    }
}
