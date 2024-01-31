import java.util.*;

public class k_reverse{
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

    public static node kReverse(node start,int k){
        if (start==null||start.next==null||k==0){
            return start;
        }
        node fixed = start;
        int count=0;
        node flipper=null;
        while(start!=null&&count<k){
            node temp = start.next;
            start.next=flipper;
            flipper=start;
            start=temp;
            count++;
        }
        fixed.next=kReverse(start,k);
        return flipper; 
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
        System.out.println();
        head = kReverse(head,4);
        displayll(head);
    }
}