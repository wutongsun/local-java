package offer17;

public class Solution {
	public static ListNode deleteDuplication(ListNode pHead)
    {
        ListNode head=new ListNode(0);
        ListNode nexttem=new ListNode(0);
        head=pHead;
        while(true){
            if(head==null)return null;
            if(head.next==null)return head;
            if(head.next.val==head.val){
                ListNode tem=new ListNode(0);
                tem=head.next;
                while(tem!=null){
                    if(tem.val==head.val){
                        tem=tem.next;
                    }else{
                        break;
                    }
                }
                head=tem;
                pHead=tem;
            }
            if(head!=null){
                nexttem=head.next;
            }else{
                return null;
            }
            if(nexttem==null) return head;
            else if(head.val!=nexttem.val){
                break;
            }
        }
        
        //head nexttem
        while(head!=null){
            if(nexttem==null)return pHead;
            if(nexttem.next!=null){
                if(nexttem.next.val!=nexttem.val){
                     head=head.next;
                     nexttem=head.next;
                }else{
                    nexttem.next=nexttem.next.next;
                    while(nexttem.next!=null){
                        if(nexttem.next.val==nexttem.val){
                            nexttem.next=nexttem.next.next;
                        }else{
                            break;
                        }
                    }
                    head.next=nexttem.next;
                    nexttem=head.next;
                }
            }else{
                break;
            }
        }
        return pHead;
        
    }
	public static void main(String[]args) {
		ListNode list=new ListNode(1);
		list.next=new ListNode(1);
		list.next.next=new ListNode(1);
		list.next.next.next=new ListNode(2);
		System.out.println(Solution.deleteDuplication(list).val);
	}
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

