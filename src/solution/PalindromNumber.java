package solution;

public class PalindromNumber {
public static void main(String[] args) {
	
	int x=1410110141

;
	
	boolean ans =isPalindrom(x);
System.out.println(ans);	
}
	
	
	
	
	
	
	
	
static boolean isPalindrom(int number){
	if(number<0) {
		
		return false;	}
	if(number<10) {
		return true;
	}
	
	double div=1;
	while(number >div*10) {
		System.out.println("div:"+div);
		div=div*10;
	}
while(number>0) {
	int right=number%10;
	int left=(int) (number/ div);
	
	System.out.println("right="+ right+" left="+left+" number="+number+" div= "+div);
if(right!=left) {
	System.out.println("right+"+ right+" left="+left+" number="+number+" div= "+div);
	
	return false;
	
}
number=(int) ((number%div)/10);
div/=100;


	

}	


	
	return true;
}
}
