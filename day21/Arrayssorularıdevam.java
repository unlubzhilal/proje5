package day21;

import java.util.Arrays;

public class Arrayssorularıdevam {

	public static void main(String[] args) {
		// arrayın tum elemanlarını toplayın
		
		int arr[]= {1,3,4,6,9,2};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
	toplam+=arr[i];
		}
System.out.println("elementlerin toplemı:"+toplam);
		
	Arrays.sort(arr);	
		
	System.out.println(Arrays.toString(arr));	
		
	String [] arr1 = {"ali", "veli", "rıza"};
	System.out.println(Arrays.toString(arr1));
	 
	int[]abc= {1,5,9,3,7,2};
	System.out.println(Arrays.toString(abc));
	Arrays.sort(abc);	
		System.out.println(Arrays.toString(abc));
		
		for (int i = abc.length-1 ; i >= 0; i--) {
			
		
			
		}
		
		
		
		
		
		
	}

}
