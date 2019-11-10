package offer3;

import java.util.ArrayList;
import java.util.Stack;

/**
 * public class ListNode{
 * 	int val;
 * 	ListNode next =null;
 * ListNode(int val){
 * 	this.val=val);
 * 	}
 * }
 * @author wutong
 *
 */
public class Solution {

	public static ArrayList printListFromTailToHead(ListNode listNode) {
		ArrayList arr=new ArrayList();
		Stack s=new Stack();
		while(listNode!=null) {
			s.push(listNode.val);
			listNode=listNode.next;
		}
		while(!s.empty()) {
			arr.add(s.peek());
			s.pop();
		}
		return arr;
	}
	public static void main(String[] args) {
		ListNode test=new ListNode(1);
		ListNode test2=test;
		for(int i=0;i<10;i++) {
			test2.next=new ListNode(i);
			test2=test2.next;
		}
		ArrayList list=printListFromTailToHead(test);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"  ");
		}
	}
	
}
class ListNode{
	int val;
	ListNode next=null;
	ListNode(int val){
		this.val=val;
	}
}