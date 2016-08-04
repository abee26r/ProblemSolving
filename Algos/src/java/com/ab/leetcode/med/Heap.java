package com.ab.leetcode.med;

import org.junit.Test;

public class Heap {
	int []a;
	int len;
	private void buildHeap(int pos, int end) {
		
		for (int i = 0; i < len; i++) {
			int left = 2 * i + 1, right = 2 * i + 1;
			if(left < len && a[left] > a[i]){
				if(right < len && a[left] < a[right]){
					swap(i, right);
				}else{
					swap(i, left);
				}
			}else if(right < len && a[right] > a[i]){
				swap(i, right);
			}
			
		}
	}
	
	public void heapify(int pos){
		int k;
		if((k = parent(pos)) != -1 && a[pos] > a[k]){
			swap(pos, k);
			heapify(k);
		}
	}
	
	private void swap(int x, int y){
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
		
		heapify(x);
	}

	private void optimizedHeapify(int a[]) {
		
	}

	private void maxVal() {
		
		buildHeap(0, len);
		System.out.println("Done");
	}
	
	public int left(int i){
		int t = ( 2 * i + 1);
		return (t >= len ? -1 : t);
	}
	
	public int right(int i){
		int t = ( 2 * i + 2);
		return (t >= len ? -1 : 2 * i + 2);
	}
	public int parent(int i){
		return (i - 1)/2;
	}
	@Test
	public void test() {

		int t[] = new int[10];
		for (int i = 0; i < t.length; i++) {
			t[i] = i;
		}
		a = t;
		len = t.length;
		maxVal();
	}
}
