import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack {
    Node top = null;

    void creation() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int data = sc.nextInt();

            if (data == -1)
                break;

            Node newnode = new Node(data);

            if (top == null) {
                top = newnode;
            } else {
                Node temp = top;

                // while (temp.next != null) {
                //     temp = temp.next;
                // }

                // temp.next = newnode;
                newnode.next = top;
                top = newnode;
            }
        }
    }
    void push(int data){
        Node newnode = new Node(data);
        if(top==null){
            top=newnode;
            return;
        }
        newnode.next=top;
        top=newnode;
        return;
    }
    void pop(){
        if(top==null){
            System.out.println("Empty Stack");
        }
        top=top.next;
        return;
    }
    int peek(){
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }

    void traversal() {
    
        int count=0;
        Node temp = top;
int max=top.data;
int min=top.data;
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
        Stack list = new Stack();

        list.creation();
        list.traversal();
        list.push(70);
        list.traversal();
        list.pop();
        list.traversal();
        list.peek();
        list.isEmpty();
    }
}