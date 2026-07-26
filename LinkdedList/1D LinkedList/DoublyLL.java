public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


    public static Node head;
    public static Node tail;
    public static int size;



    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }


    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public void add(int index, int data){

        if(index==0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp=head;

        int i=0;

        while(i<index-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        newNode.prev=temp;
        if(temp.next!=null){
            temp.next.prev=newNode;
        }
        temp.next=newNode;
    }


    public void removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return;
        }

        if(head==tail){
            head=tail=null;
            return;
        }

        head=head.next;
        head.prev=null;
    }


    public void removeLast(){
        if(head==null){
            System.out.println("DLL is empty");
            return;
        }

        if(head==tail){
            head=tail=null;
            return;
        }

        tail=tail.prev;
        tail.next=null;
    }


    public void remove(int index){
        if(index==0){
            removeFirst();
            return;
        }

        Node temp=head;
        int i=0;

        while(i<index){
            temp=temp.next;
            i++;
        }

        temp.prev.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
    }


    public int size(){
        Node temp=head;

        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }


    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.addLast(4);
        dll.print();
        System.out.println("Size: " + dll.size());
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();
    }

}