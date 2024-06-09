package solution;

import java.util.Iterator;

public class ReverseString {
	public static void main(String[] args) {
		char[] s= {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
		char[] a=reverseString(s);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
	}
 static char[] reverseString(char [] input){
	 int pointer=input.length-1;
	 char temp;
	 for (int i = 0; i < input.length; i++) {
		temp=input[i];
		input[i]=input[pointer];
		
		input[pointer]=temp;
		pointer--;
		if (pointer<=i) {
			break;
		}
	}
	 
	 return input;
 }
	
	
}
