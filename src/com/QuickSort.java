package com;

public class QuickSort {
	
	public void quickSort(int[] a, int low, int high){
		if(low < high){
			int pi = partition(a, low, high);	
			quickSort(a,low,pi-1);
			quickSort(a,pi+1,high);
		}
	}
	
	private int partition(int[] a, int low, int high){
		System.out.println("low="+low+", high="+high);
		int pivot = a[high];
		int i = low - 1;
		for(int j=low; j<high; j++){
			if(a[j] <= pivot){
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i+1, high);
		return i+1;
	}
	
	private void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 2, 4, 3, 7, 8, 4, 3, 1};
		System.out.print("Before sorting : ");
		for (int i : a) {
			System.out.print(i +" ");	
		}
		QuickSort qs = new QuickSort();
		int low = 0;
		int high = a.length-1;
		qs.quickSort(a, low, high);
		
		System.out.print("\nAfter  sorting : ");
		for (int i : a) {
			System.out.print(i +" ");	
		}
		
		
	}

}
