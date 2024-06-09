package solution;

import java.util.Iterator;

public class RemoveElement {
public static void main(String[] args) {
	int nums[]= {0,1,2,2,0,4,2};
	System.out.println(nums.length);
	System.out.println(removeElement(nums,2));
}
    static int removeElement(int[]nums, int k){
		int counter=0;
	
		for (int i = 0; i < nums.length; i++) {
			

			
			if (nums[i]!=k) {

				nums[counter]=nums[i];

				counter++;
				
				
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		return counter;
	}
	
}