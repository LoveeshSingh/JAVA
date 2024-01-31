import java.util.*;

public class k_from_last{
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

    public static int kFromLast(int k,node start){
        if (start==null){
            return -1;
        }
        node fast = start;
        node slow = null;
        int count = 1;
        while (fast.next!=null){
            if (count==k){
                slow = start;
            }
            else if (count<k){
                fast = fast.next;
            }
            else{
                slow = slow.next;
                fast = fast.next;
            }
            count++;
        }
        if (count<k){
            return -1;
        }
        else{
            return (slow==null)?start.value:slow.value;
        }
    }

    public static node kFromLast(int k,node start,node end){
        if (start==end){
            
        }
        node slow = start;
        node fast = start;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        node  mid = slow;
        return mid;
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
        System.out.println(kFromLast(10,head));

    } 
}