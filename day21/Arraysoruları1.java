package day21;

import java.util.Arrays;

public class Arraysorular�1 {

	public static void main(String[] args) {
		// �� elemnal� bir aray�n elemanlar�n� sola kayd�r�n

	int  arr[]= {1,2,3,4,5};
	int kova=arr[0];
	
	for (int i = 0; i < arr.length-1; i++) {
		
		arr[i]=arr[i+1];
		
	}
	
	arr[arr.length-1]=kova;
	
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(arr));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
