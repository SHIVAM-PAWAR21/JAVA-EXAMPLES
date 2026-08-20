package collection;

class Node{
    int data;
    Node next;
    Node(int data){
     this.data=data;
     this.next=null;
    }
}
class LinkedList{

    Node head;

    void add(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;

    }

    void delete(int data){

        if (head==null)return;

        if (head.data==data){
            head=head.next;
        }

        Node temp=head;
        while(temp.next!=null && temp.next.data!=data){
            temp=temp.next;
        }
        if (temp.next!=null){
            temp.next=temp.next.next;
        }


    }


    void display(){
        if (head==null)return;

        Node temp=head;

        while(temp!=null){
           System.out.print(temp.data+"->");
           temp=temp.next;
        }
        System.out.print("null");
    }

}

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList linkedList=new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("\ninsert");
        linkedList.display();

        linkedList.delete(30);
        System.out.println("\ndelete");
        linkedList.display();
    }
}
