/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     ListNode t1 = list1;
      ListNode t2 = list2;
      ListNode dummy = new ListNode(-1);
      ListNode tail = dummy;
      while(t1!=null && t2!=null){
        if(t2.val > t1.val){
            tail.next = t1;
            t1=t1.next;
        }
        else{
            tail.next = t2;
            t2=t2.next;
        }
        tail = tail.next;
      }
      if(t1!=null){
        tail.next = t1;
      }
      else{
        tail.next = t2;
      }
      dummy = dummy.next;
    return dummy;
    }
}
