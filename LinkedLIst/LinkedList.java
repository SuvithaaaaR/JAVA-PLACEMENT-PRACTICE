import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head = null;

    void creation() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int data = sc.nextInt();

            if (data == -1)
                break;

            Node newnode = new Node(data);

            if (head == null) {
                head = newnode;
            } else {
                Node temp = head;

                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = newnode;
            }
        }
    }
    void insertB(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        return;
    }

    void traversal() {
    
        int count=0;
        Node temp = head;
int max=head.data;
int min=head.data;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            if(temp.data>max){
                max=temp.data;
            }
            if(temp.data<min){
                min=temp.data;;
            }
            temp = temp.next;
            count++;
        }

        System.out.println("null");
        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.creation();
        list.traversal();
        list.insertB(70);
        list.traversal();
    }
}