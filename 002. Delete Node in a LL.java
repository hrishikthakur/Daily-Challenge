// Given -> Node to be deleted
// Algo -> swap(node, node.next) then update the next of given node
class Solution {
    public static void swap(ListNode n1, ListNode n2){
        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;
    }
    
    public void deleteNode(ListNode node) {
        swap(node, node.next);
        node.next = node.next.next;
    }
}
