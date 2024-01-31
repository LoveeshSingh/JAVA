import java.util.*;

public class fold{
    public static node head = null;
    public static node tail = null;

    public static class node{
        public int value;
        public node next;
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
        System.out.println();
    }

    public static node findMid(node start,node end){
        node fast = start;
        node slow = start;
        while (fast!=end&&fast.next!=end){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static node reverse_iterativell(node start){
        tail=start;
        node flipper = null;
        while(start!=null){
            node temp = start.next;
            start.next=flipper;
            flipper = start;
            start=temp;
        }
        return flipper;
    }

    

    public static void foldll(node start,node end){
        if (start==null){
            return;
        }
        node mid = findMid(start,end);
        mid.next=reverse_iterativell(mid.next);
        node temp = mid.next;
        while(start!=mid){
            node just=start.next;
            start.next=temp;
            start = just;

            just = temp.next;
            temp.next=start;
            temp=just;
        }
        if (temp!=null){
            node just=start.next;
            start.next=temp;
            start = just;
        }
        else{
            mid.next=null;
        }
    }

    public static void main(String[] args){
        add_lastll(1);
        // add_lastll(2);
        // add_lastll(3);
        // add_lastll(4);
        // add_lastll(5);
        // add_lastll(6);
        // add_lastll(7);
        // add_lastll(8);
        // add_lastll(9);
        displayll(head);
        foldll(head,tail);
        System.out.println();
        displayll(head);
    }
}