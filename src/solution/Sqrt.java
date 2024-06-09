package solution;

public class Sqrt {
public static void main(String[] args) {
	int x= sqrt(2147395599);
	System.out.println(x);
}
	static int sqrt(int x){
		int max=x/2;
		int low=0;
		long mid=(max+low)/2;
		long sq;
	while(low<=max) {
		sq=mid*mid;
		if (sq==x) {
			return (int) mid;
		}
		if (sq<x) {
			low=(int) (mid+1);
			mid=(max+low)/2;
			
		}else 	{
			max=(int) (mid-1);
			mid=(max+low)/2;
		}
		
	}
	
	
	return (int) mid;
	}
}
