public class SortLL{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head;

    public Node findMid(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public Node Sort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node mid=findMid(head);
        Node rightHead=mid.next;
        mid.next=null;

        Node newLeft=Sort(head);
        Node newRight=Sort(rightHead);

        return merge(newLeft,newRight);
    }

    public Node merge(Node left, Node right){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }

        while(left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }

        while(right!=null){
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }

        return mergedLL.next;
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
        SortLL sortLL = new SortLL();
        sortLL.head=new Node(4);
        sortLL.head.next=new Node(2);
        sortLL.head.next.next=new Node(1);
        sortLL.head.next.next.next=new Node(3);
        sortLL.print();
        sortLL.head=sortLL.Sort(sortLL.head);
        sortLL.print();
    }
}