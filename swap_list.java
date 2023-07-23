  class ListNode {
      int val;
      ListNode next;
      ListNode(int val) { 
        this.val = val;
        next=null;
    }
}
 
class swap_list {
    ListNode head;
    public void insert(ListNode head,int i){
        ListNode n=new ListNode(i),current;
        current=head;
        if(head==null){
            head=n;
            head.next=null;
        }else{
            while(current.next!=null){
                current=current.next;
            }
            current.next=n;
            n.next=null;
        }
        }
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head,x;
        while(temp!=null){
            x=temp.next;
            temp.next=temp.next.next;
            temp.next.next=x;
            temp=temp.next;
        }
        return head.next;
    }
    private void printList(ListNode a) {
        while(a!=null){
            System.out.print(a.val+" ");
            a=a.next;
        }
    }
    public static void main(String[] args) {
        swap_list s=new swap_list();
        ListNode n=new ListNode(5); 
        s.insert(n,1);
        s.insert(n,2);
        s.insert(n,3);
        s.insert(n,4);
        ListNode a=s.swapPairs(n);
        s.printList(a);
    }

}
// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         ListNode temp=head,x;
//         while(temp!=null){
//             x=temp.next;
//             temp.next=temp.next.next;
//             temp.next.next=x;
//             temp=temp.next;

//         }
//         return head.next;
//     }
// }