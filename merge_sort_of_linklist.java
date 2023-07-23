public class merge_sort_of_linklist extends linkedlist{
    public static void merge_sorts(node head1,node head2){
        node temp=head2,current=head1;
        while(temp!=null){

            while(current!=null){
            if(current.next.data>temp.data){
                temp.next=current.next;
                current.next=temp;
                break;
            }
            current=current.next;
        }
        temp=temp.next;
        }
    }
    public static void main(String[] args) {
        linkedlist l1=new linkedlist();
        node head1=l1.insert(25);
        l1.insert(35);
        l1.insert(12);
        l1.insert(4);
        l1.insert(36);
        l1.insert(48);
        linkedlist l2=new linkedlist();
        node head2=l2.insert(8);
        l2.insert(32);
        l2.insert(22);
        l2.insert(45);
        l2.insert(63);
        l2.insert(49);
        merge_sorts(head1,head2);
        node x=head1;
        while(x.next!=null){
            System.out.print(x.data+" ");
            x=x.next;
        }
    }
}
