import java.util.*;

public class reverse_pointer_iterative{
    static node head = null;
    static node tail = null;

    static class node{
        int value;
        node next;
        public node(int value){
            this.value=value;
            this.next=null;
        }
    }

    public static void add_lastll(int value){
        if (head==null){
            head = new node(value);
            tail = head;
            return;
        }
        else{
            node n = new node(value);
            tail.next=n;
            tail=n;
        }
    }

    public static void displayll(node start){
        if (start==null){
            System.out.print("no element in list");
        }
        else{
            while(start!=null){
                System.out.print(start.value+" ");
                start=start.next;
            }
        }
    }

    public static void reverse_iterativell(node start){
        tail=start;
        node flipper = null;
        while(start!=null){
            node temp = start.next;
            start.next=flipper;
            flipper = start;
            start=temp;
        }
        head=flipper;
    }

    public static void main(String[] args){
        add_lastll(1);
        add_lastll(2);
        add_lastll(3);
        add_lastll(4);
        add_lastll(5);
        add_lastll(6);
        add_lastll(7);
        add_lastll(8);
        add_lastll(9);
        displayll(head);
        reverse_iterativell(head);
        System.out.println();
        displayll(head);
    }
}