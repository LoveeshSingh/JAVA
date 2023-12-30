import java.util.*;

public class get_first{
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

    public static int get_firstll(node start){
        return start.value;
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
        System.out.println(get_firstll(head));
    }

}