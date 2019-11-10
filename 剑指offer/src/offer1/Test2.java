package offer1;

import java.util.LinkedList;
public class Test2 {
    public static ListNode ReverseList(ListNode head) {
        LinkedList <ListNode> list = new LinkedList<ListNode>();
        
        
        while(head!=null){
            if(!list.isEmpty()){
                ListNode tem=head.next;
                head.next=list.getLast();
                list.add(head);
                head=tem;
            } else{
                list.add(head);
                head=head.next;
            }
        }
        return list.getLast();
    }
    public static void main(String[] args) {
    	ListNode first=new ListNode(5);
    	first.next=new ListNode(4);
    	first.next.next=new ListNode(3);
    	first.next.next.next=new ListNode(2);
    	first.next.next.next.next=new ListNode(1);
    	Test2.ReverseList(first);
    	System.out.println(first.val);
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
