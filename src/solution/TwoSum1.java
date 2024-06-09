package solution;

import java.util.HashMap;

public class TwoSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3,2,4};
		int target = 6;
		int[] sol= twosum(nums,target);
	for (int i : sol) {
		System.out.println(i);
	}
	
	
	
	}
static int []twosum(int[] numbers, int target ) {
	HashMap<Integer ,Integer> hmap=new HashMap<Integer, Integer>();
	int i=0;
	int[] sol=new int[2];
	for (int number : numbers) {
	int difference=	target - number;
		
	if (hmap.containsKey(difference)){
		sol[0]=hmap.get(difference);
		sol[1]=i;
	i++;
	return sol;
	}else {
		hmap.put(number,i);
		i++;
		
		
	}
	}
	return sol;
	
	
	
}
}
