# 21. Merge Two Sorted Lists

### Difficulty: Easy

## Description
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 
Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]


Example 2:


Input: list1 = [], list2 = []
Output: []


Example 3:


Input: list1 = [], list2 = [0]
Output: [0]


 
Constraints:


	The number of nodes in both lists is in the range [0, 50].
	-100 <= Node.val <= 100
	Both list1 and list2 are sorted in non-decreasing order.

## Submission Details
- **Status**: Accepted
- **Runtime**: 0 ms
- **Memory**: 44400000
- **Language**: java

## Code
```java
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

```
