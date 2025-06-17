import java.util.*;
 class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class DetectCycleLinkedList{
    public static boolean hasCycle(ListNode head){
        if (head==null || head.next==null){
            return false;
        }       
        ListNode slow=head;     
        ListNode fast=head.next;         
        while(fast!=null && fast.next!=null){
            if(slow==fast){
                return true; 
            }
            slow=slow.next;
            fast=fast.next.next;
        }      
        return false; 
    }   
    public static void main(String[] args){
        ListNode head=new ListNode(3);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(0);
        ListNode node4=new ListNode(-4);
        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node2;
        System.out.println("Does this linked list have a cycle? " + hasCycle(head));
    }
}
