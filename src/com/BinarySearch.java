package com;

public class BinarySearch {
	
	private static int binarySearch(int[] arr, int x){
		int l= 0;
		int r = arr.length;
		
		while (l <= r) {
			int m = l + (r-1)/2;
			if(arr[m] == x)
				return m;
			if (arr[m] < x)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = {1,3,5,6,7,9};
		int z =9;
		int result = binarySearch(a, z);
		System.out.println("Result="+ result);
	}
}
