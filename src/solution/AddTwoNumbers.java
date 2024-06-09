package solution;

public class AddTwoNumbers {
	public static void main(String[] args) {
		   ListNode l1 = toListNode(9999999);
	     /*
		   l1.next = new ListNode(4);
	        l1.next.next = new ListNode(3);
	      */

	        ListNode l2 = toListNode(9999);
	       /* l2.next = new ListNode(6);
	        l2.next.next = new ListNode(4);
*/
	        ListNode listsum = addTwoNumbers(l1, l2);
	        
	       // Print the merged list
	        while (listsum != null) {
	            System.out.print(listsum.val + "->");
	            listsum= listsum.next;
	        }
	}

		private static ListNode toListNode(int sum) {
			if (sum==0) {
				return new ListNode(0);
					
			}
			ListNode dummy = new ListNode(0);
			ListNode sumList=dummy;
			
			while (sum>0) {
			
			
				sumList.next= new ListNode((int) (sum%10));
				sumList=sumList.next;
				System.out.println();
				
				sum=sum/10;
			}
			
			
			
			return dummy.next;
		}

		static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode dummy =new ListNode(0);
	        ListNode sumlist=dummy;
			int sum=0;
			int carry=0;
			int v1,v2;
			while (l1!=null||l2!=null|| carry!=0) {
				System.out.println("sum " + sum+ " carry "+ carry);

				if (l1!=null) {
					v1=l1.val;
				}else 
					v1=0;
				
				if (l2!=null) {
					v2=l2.val;
				}else 
					v2=0;
				
				sum=(carry+v1+v2);
			    carry=sum/10;
			
				sumlist.next=new ListNode(sum%10);
				
				if (l1!=null) {
					
					l1=l1.next;
				} 
				if (l2!=null) {
				l2=l2.next;
				}
				sumlist=sumlist.next;
				
				//   9999
				//9999999
			}
		
		
			return dummy.next;
			
		}
}
	
	

