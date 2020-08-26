package com;

public class SubArraySum {

	private static int[] subArray(int a[], int s){
		int[] result = new int[]{-1};
		int left = 0;
		int right = 0;
		int sum = 0;
		
		while(right < a.length){
			sum += a[right];
			while(left < right && sum > s){
				sum -= a[left++];
			}
			
			if(sum == s && (result.length ==1 || result[1]-result[0] < right-left)){
				result = new int[]{left+1, right+1};
			}
			
			++right;
		}
		
		return result;
	}
	
	public static void main(String[] args) {

		int a[] = {2,4,3,5,1,0,6,7,8,9};
		int result[] = subArray(a, 15);
		for (int i : result) {
			System.out.print(i + " ");
		}
		
		
	}

}
