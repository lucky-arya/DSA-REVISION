public class LinkedList{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
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
        head=newNode;
    }


    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
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
        temp.next=newNode;
    }


    public void removeFirst(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }

        head=head.next;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }


        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    

    public void remove(int index){

        if(index==0){
            removeFirst();
            return;
        }

        Node temp=head;
        int i = 0;

        while(i<index-1){
            temp=temp.next;
            i++;
        }

        temp.next=temp.next.next;
    }

    public int Search(int key){
        Node temp=head;
        int index=0;

        while(temp!=null){
            if(temp.data==key){
                return index;
            }
            temp=temp.next;
            index++;
        }
        
        return -1;
    }


    public int size(){
        if(head==null){
            return 0;
        }

        Node temp=head;

        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;
    }


    public void print(){
        if(head==null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.add(2, 4);
        ll.print();
        System.out.println("Size of Linked List: " + ll.size());
        System.out.println(ll.Search(4));
    }
}