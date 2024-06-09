package solution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	
	public static void main(String[] args) {
		String s="((";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
			if(s.length()%2!=0)
			return false;
			Map<Character, Character>map= new HashMap<Character, Character>();
			map.put('}','{');
			map.put(']','[');
			map.put(')','(');
			
			Stack<Character> open=new Stack<Character>();
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='[') {
					open.push(s.charAt(i));
					
				}
			
				else  {
					if (open.empty()) {
						return false;
						
					}
				
					
					if (open.peek()== map.get(s.charAt(i))) {
						open.pop();
					}else {
						return false;
					}
					
				}
			 
			}
		
			if (!open.isEmpty()) {
				return false;
			}
			return true;
		}      
	    }
