package solution;

import java.util.HashMap;
import java.util.Iterator;

public class RomanToInt {
public static void main(String[] args) {
	String ss="MMMCMXCIX";
	System.out.println(romanToInt(ss));
}
	
	static int romanToInt(String s){
	    HashMap<Character, Integer> values = new HashMap<Character, Integer>();
values.put('I', 1);
values.put('V', 5);
values.put('X', 10);
values.put('L', 50);
values.put('C', 100);
values.put('D', 500);
values.put('M', 1000);
		
		
		int sum=0;

		sum=values.get(s.charAt(s.length()-1));
		for (int i =0;  i <=s.length()-1; i++) {
			
			 if (i+1<s.length()){
				 
			 if (
				
			values.get(s.charAt(i))< values.get(s.charAt(i+1))) {
				
				sum=sum-values.get(s.charAt(i));
			 } 
			 else {

					sum=sum+values.get(s.charAt(i));
				
				}	
				
			}
				
		
			
		}
		
		
		
		
		
		return sum;
		
	}
}
