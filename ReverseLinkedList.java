import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class ReverseLinkedList{
    public static ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        while (current != null){
            ListNode nextNode=current.next;  
            current.next=prev;                
            prev=current;                    
            current=nextNode;                
        }
        return prev; 
    }
    public static void printList(ListNode head){
        ListNode temp=head;
        while (temp!=null) {
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);      
        System.out.println("Original list:");
        printList(head);     
        ListNode reversedHead=reverseList(head);       
        System.out.println("Reversed list:");
        printList(reversedHead);
    }
}
