package day22Arrays;

import java.util.Arrays;

public class Array�rnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "java ��renmek cok g�zel "
		// ters s�rada yazd�r 
	
	String cumle="java ��renmek �ok g�zel";
	
		String []arr=cumle.split(" ");
		
	System.out.println(Arrays.toString(arr));
	
	for (int i = arr.length-1; i >= 0; i--) {
		
	System.out.print(arr[i]+" ");
	}
	System.out.println();
	int a[]= {9, 2, 3, 4, 5, 6, 7, 8, 1, };
	System.out.println(Arrays.toString(a));
	
	Arrays.sort(a);
	
	
	
	
	
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.binarySearch(a, 9));
	System.out.println(Arrays.binarySearch(a, 10));
	
	for (int i = a.length-1; i >= 0; i--) {
	System.out.print(a[i]+" ");	
	}
	
	
	
	
	
	
	
	}

}
