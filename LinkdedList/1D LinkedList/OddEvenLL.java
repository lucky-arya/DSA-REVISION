public class OddEvenLL{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
         if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }



    public Node oddEvenList(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node odd=head;
        Node even=head.next;
        Node evenStart=even;

        while(odd.next!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }

        odd.next=evenStart;

        return head;
    }

     public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


}