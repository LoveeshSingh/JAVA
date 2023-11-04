import java.util.*;

public class add_first{
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

    public static void add_firstll(int value){
        if (head==null){
            head = new node(value);
            tail = head;
            return;
        }
        else{
            node n = new node(value);
            n.next=head;
            head=n;
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
    public static void main(String[] args){
        add_firstll(7);
        add_firstll(6);
        add_firstll(5);
        add_firstll(4);
        add_firstll(3);
        add_firstll(2);
        add_firstll(1);
        displayll(head);
    }
}