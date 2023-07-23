class node{
    int data;
    node next;
    node(int value){
        this.data=value;
        next=null;
    }
}
public class linkedlist {
    private int size=0;
    private node head;
    // public linkedlist(){
    //     this.head=null;
    // }
    public node insert(int i){
        node n=new node(i),current;
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
        return n;
    }
    public void insertAtStart(int i){
        node n=new node(i);
        n.next=head;
        head=n;
        }
    public void insertAtMiddle(int i,int pos){
        node n=new node(i);
        node current=head;
        if(head!=null && pos<size){
        for(int j=0;j<pos;j++){
            current=current.next;
        }
        n.next=current.next;
        current.next=n;
        }
}
public void traverse(){
    if(head==null){
        System.out.println("no ele");
    }else{
    node current=head;
        while(current.next!=null){
        System.out.println(current.data);
        current=current.next;
    }
}
}
public void deleteAtStart(){
    head=head.next;
}
public void DeleteAtEnd(){
    node current=head;
    while(current.next.next!=null){
        current=current.next;
    }
    current.next=null;
}
public void DeleteAtMiddle(int pos){
    if(head==null && pos<size){
        node current=head;
        for(int j=0;j<pos-1;j++){
            current=current.next;
        }
        current.next=current.next.next;
    }
}
}
