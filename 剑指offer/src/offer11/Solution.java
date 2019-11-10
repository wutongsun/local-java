package offer11;

public class Solution {

	public ListNode Merge(ListNode list1,ListNode list2) {
		ListNode list=new ListNode(0);
		ListNode head=list;
		while(list1!=null&&list2!=null) {
			if(list1.val>list2.val) {
				list.next=list2;
				list2=list2.next;
			}else {
				list.next=list1;
				list1=list1.next;
			}
			list=list.next;
		}
		if(list1!=null) {
			list.next=list1;
		}else {
			list.next=list2;
		}
		return head.next;
	}
	public static void main(String[]args) {
		
	}
}
class ListNode{
	int val;
	ListNode next=null;
	ListNode(int val){
		this.val=val;
	}
}