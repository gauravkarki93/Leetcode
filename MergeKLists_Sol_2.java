/*
LOGIC
- Merge2Lists at time; take O(N) times; where N is total nodes in those 2 lists
- So total k-1 merges; where k is no of lists
- Save result of first two lists into second
- Repeat till n-1
*/
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        for(int i = 0; i<lists.length-1; i++)
        {
            lists[i+1] = merge2List(lists[i], lists[i+1]);
        }
        return lists[lists.length-1];
    }
    public ListNode merge2List(ListNode l1, ListNode l2)
    {
        ListNode preNode = new ListNode(-1);
        ListNode prev = preNode;
        while(l1!=null && l2!=null)
        {
            if(l1.val <= l2.val)
            {
                prev.next = l1;
                l1 = l1.next;
            }
            else
            {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if(l1 == null)
            prev.next = l2;
        else
            prev.next = l1;
        return preNode.next;
    }
}
