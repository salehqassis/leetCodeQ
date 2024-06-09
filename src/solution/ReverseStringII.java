package solution;

import java.util.Iterator;

public class ReverseStringII {
	public static void main(String[] args) {
		String str="dkxfcser";
	System.out.println(reverseString(str,2));
				
	}

	static String reverseString(String str, int k){

		if (str.isEmpty()||str.length()==1) {
			return str;
		}
		
		char []arr = str.toCharArray();
		char temp;
		
				
				for (int i = 0; i < arr.length; i+=2*k) {
					int start=i, end=Math.min(i+k-1, arr.length-1);

					while (start<=end) {
						temp=arr[start];
						arr[start]=arr[end];
						arr[end]=temp;
						start++;
                        end--;
						
					}
						
				}
		
	
			
		
	
		
		
		return String.valueOf(arr);

	}}
