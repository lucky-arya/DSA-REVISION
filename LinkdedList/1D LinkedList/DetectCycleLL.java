public class DetctCycleLL {
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

    public boolean detectCycle(Node head){
        if(head==null || head.next==null){
            return false;
        }

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }

        return false;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        DetctCycleLL ll = new DetctCycleLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        // Creating a cycle for testing
        ll.tail.next = ll.head.next; // Creating a cycle

        System.out.println("Cycle detected: " + ll.detectCycle(ll.head));
    }
}