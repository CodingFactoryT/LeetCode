package Problems_20_to_39;

public class P0021_MergeTwoSortedLists_21 {
	public static void main(String[] args) {
		ListNode l1_3 = new ListNode(4);
		ListNode l1_2 = new ListNode(2, l1_3);
		ListNode l1_head = new ListNode(1, l1_2);
		
		ListNode l2_3 = new ListNode(4);
		ListNode l2_2 = new ListNode(3, l2_3);
		ListNode l2_head = new ListNode(1, l2_2);
		
		ListNode result = mergeTwoLists(l1_head, l2_head);

		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
		
	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1 == null && list2 == null) return null;
		if(list1 == null) return list2;
		if(list2 == null) return list1;

		ListNode headOfResult = new ListNode();
		ListNode last = headOfResult;

		while(true) {
			ListNode node = new ListNode();

			try {
				if(list1 != null && list1.val <= list2.val ) {
					node.val = list1.val;
					list1 = list1.next;
				} else if(list2 != null){
					node.val = list2.val;
					list2 = list2.next;
				}
			} catch(Exception e) {				//list2 is null
				node.val = list1.val;
				list1 = list1.next;
			}
			last.next = node;
			last = last.next;
			if(list1 == null && list2 == null) break;
		}
        return headOfResult.next;	//.next because headOfresult.val = 0
    }
	
}

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  
  ListNode(int val) { 
	  this.val = val; 
  }
  
  ListNode(int val, ListNode next) { 
	  this.val = val; this.next = next; 
  }
  
}
