package solution;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		int[] arr= {0,0,1,1,1,2,2,3,3,4};
		
		int test=removeDuplicates(arr);
	}
	static int removeDuplicates(int[]arr){
		
		if (arr.length==0||arr.length==1) {
			return arr.length;
		}
		
		int counter=1 ;	
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i]!= arr[i-1]) {
				arr[counter]= arr[i];
				counter++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println(counter);
		
		return counter;
	}
}
