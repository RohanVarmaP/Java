class Node{
    private int data;
    private Node next;
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    public Node(int data) {
        this.data = data;
    }
    public void setData(int data, Node next) {
        this.data = data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public int getData(){
        return this.data  ;
    }
    public Node getNext(){
        return this.next;
    }
}

class LinkedList{
    private Node head;
    public void insertAtFirst(int data){
        Node node=new Node(data,head);
        head=node;
    }
    public void insert(int data){
        if(head==null){
            insertAtFirst(data);
        }else{
            Node node=new Node(data,null);
            Node n =head;
            while(n.getNext()!=null){
                n=n.getNext();
            };
            n.setNext(node);
        }
    }
    public void insertAt(int index,int data){
        if(index==0){
            insertAtFirst(data);
        }else{
            if(head==null){
                insertAtFirst(data);
            }else{
                Node node=new Node(data,null);
                Node n =head;
                for(int i=1;i<index;i++){
                    n=n.getNext();
                }
                node.setNext(n.getNext());
                n.setNext(node);
            }
        }
    }
    public void remove(){
        if(head==null){
            return;
        }else{
            Node n=head;
            while(n.getNext().getNext()!=null){
                n=n.getNext();
            }
            n.setNext(null);
        }
    }
    public void removeAt(int index){
        if(head==null){
            return;
        }else{
            Node n=head;
            Node prev=null;
            for(int i=0;i<index;i++){
                prev=n;
                n=n.getNext();
            }
            prev.setNext(n.getNext());
        }
    }
    public void show(){
        Node n=head;
        while(n!=null){
            System.out.print(n.getData()+(n.getNext()==null?".":"-> "));
            n=n.getNext();
        }
        System.out.println("");
    }
    public Boolean isEmpty(){
        return head==null?true:false;
    }
    public int size(){
        if(head==null){
            return 0;
        }else{
            int i=0;
            Node n=head;
            while(n!=null){
                i++;
                n=n.getNext();
            }
            return i;
        }
    }
}


public class JAVA_2025_12_24_2_linkedList {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        System.out.println("Is Empty: "+l.isEmpty());
        l.insert(2);
        System.out.println("After adding 2. Is Empty: "+l.isEmpty());
        l.insertAtFirst(12);
        l.insert(1);
        l.insert(123);
        l.insert(3);
        l.insertAt(3,51);
        l.show();
        l.remove();
        l.show();
        l.removeAt(3);
        l.show();
        System.out.println("Size: "+l.size());
    }
}
