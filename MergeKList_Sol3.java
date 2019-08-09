/*
Logic
- Take 2 lists at time
- At intervals like L0,L1,L2,L3,L4
- So just merge (L0,L1) -> L0; (L2,L3) -> L2; (L3,L4) -> L3; leave L4
- Repeat until interval > K
*/
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;       
        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i < lists.length - interval; i += 2 * interval) {
                lists[i] = merge2Lists(lists[i], lists[i + interval]);    
            }            
            interval *= 2;
        }
        return lists[0];     
    }
     public ListNode merge2Lists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while(l1 != null && l2 != null)
        {
            prev.next = l1.val <= l2.val ? l1 : l2;
            if(l1.val<=l2.val)
                l1 = l1.next;
            else
                l2 = l2.next;
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}
