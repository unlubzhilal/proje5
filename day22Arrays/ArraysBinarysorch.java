package day22Arrays;

import java.util.Arrays;

public class ArraysBinarysorch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String []isimler= {"hacer", "ayangul", "emine", "murat", "kutlu"};
	// isimler arrayinde murat ismi avr m�?
	
	Arrays.sort(isimler);
	System.out.println(Arrays.toString(isimler));
	
	
	// stringleri asci degelrine g�re s�ralar 
	
	isimler[4]="ahmet";
	Arrays.sort(isimler);
	System.out.println(Arrays.toString(isimler));
	
	System.out.println(Arrays.binarySearch(isimler, "kutlu"));
	System.out.println(Arrays.binarySearch(isimler, "kur�at"));
	
	
	
	
	
	
	
	
	}

}
