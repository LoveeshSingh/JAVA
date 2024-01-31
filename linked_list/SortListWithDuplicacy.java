import java.util.*;

public class SortListWithDuplicacy{
    public static node head=null;
    public static node tail=null;

    public static class node{
        public int value;
        public node next;
        public node(int value,node next){
            this.value=value;
            this.next=next;
        }
        public node(int value){
            this.value=value;
            this.next=null;
        }
    }

    public static void add_lastll(int value){
        if (head==null){
            head = new node(value);
            tail=head;
        }
        else{
            tail.next=new node(value);
            tail=tail.next;
        }
    }

    public static void displayll(node start){
        if (start==null){
            System.out.println("NO NODES IN LINKED LIST");
        }
        else{
            while(start!=null){
                System.out.print(start.value+"  ");
                start=start.next;
            }
            System.out.println();
        }
    }

    public static void removeDuplicacy(node start){
        if (start.next==null){
            return;
        }
        else if (start.next.value==start.value){
            start.next=start.next.next;
        }
        else{
            start=start.next;
        }
        removeDuplicacy(start);
    }

    public static void main(String[] args){
        // head = 
        // new node(1,
        // new node(1,
        // new node(1,
        // new node(4,
        // new node(5,
        // new node(6,
        // new node(7,
        // new node(8,
        // new node(9,
        // tail = 
        // new node(10,null))))))))));
        add_lastll(1);
        add_lastll(1);
        add_lastll(2);
        add_lastll(4);
        add_lastll(4);
        add_lastll(4);
        add_lastll(4);
        add_lastll(4);
        add_lastll(5);
        displayll(head);
        System.out.println();
        removeDuplicacy(head);
        displayll(head);



    }
}