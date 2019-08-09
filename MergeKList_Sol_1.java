 //Logic
 /*
 -Just copy all the Linked Lists into ArrayList
 -Convert that ArrayList to array
 -Sort that array
 -Create a new Linked List
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i<lists.length; i++)
        {
            if(lists[i]==null)
                continue;
            ListNode currNode = lists[i];
            while(currNode!=null)
            {
                arrayList.add(currNode.val);
                currNode = currNode.next;
            }
        }
        Integer allNodes[] = new Integer[arrayList.size()];
        allNodes = arrayList.toArray(allNodes);
        Arrays.sort(allNodes);
        if(allNodes.length == 0)
            return null;        
        
        ListNode root = new ListNode(allNodes[0]);
        ListNode curr = root;
        for(int i = 1; i<allNodes.length; i++)
        {
            curr.next = new ListNode(allNodes[i]);
            curr = curr.next;
        }
        return root;
    }
}
