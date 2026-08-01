public class FindStartingPoint{
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

    public Node findStartingPoint(Node head){
        if(head==null || head.next==null){
            return null;
        }

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                break;
            }
        }

        if(slow!=fast){
            return null;
        }

        slow=head;

        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        FindStartingPoint ll = new FindStartingPoint();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();


        //cycle for testing
        ll.tail.next = ll.head.next.next;

        Node startingPoint = ll.findStartingPoint(ll.head);
        if(startingPoint!=null){
            System.out.println("Starting point of the cycle is: "+startingPoint.data);
        }else{
            System.out.println("No cycle found.");
        }
    }
}