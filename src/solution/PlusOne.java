package solution;

import java.util.Iterator;

public class PlusOne {
	int[] plusOne(int[] input) {
		for (int i = input.length-1; i >=0 ; i--) {
			if (input[i]<9) {
				input[i]=input[i]+1;
				return input;
			}else 
				input[i]=0;
		}
		int[]newarr=new int[input.length+1];
		newarr[0]=1;		
	
		
return newarr;		
	}		

}