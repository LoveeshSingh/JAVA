import java.util.*;

public class display_reverse{
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

    public static void display_reversell(node start,node end){
        if (start==null){
            System.out.print("no element in list");
        }
        else{
            while(start!=end && end.next!=start){
                node worker = start;
                while(worker.next!=end){
                    worker=worker.next;
                }
                System.out.print(end.value+" ");
                end=worker;
            }
            if (start==end){
                System.out.println(end.value+" ");
            }
        }
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
        display_reversell(head,tail);
    }

}