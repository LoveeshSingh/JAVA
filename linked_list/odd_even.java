import java.util.*;

public class odd_even{
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

    public static node oddEven(node start){
        if (start==null||start.next==null){
            return start;
        }
        node mid = null;
        node end = new node(0,start);
        while (end.next!=null){
            if (end.next.value%2==1){
                if (mid==null&&end.next==start){
                    mid=start;
                    end=end.next;
                }
                else if (mid==null&&end.next!=start){
                    mid = new node(end.next.value,start);
                    start=mid;
                    end.next=end.next.next;
                }
                else{
                    mid.next=new node(end.next.value,mid.next);
                    mid=mid.next;
                    end.next=end.next.next;
                }
            }
            else{
                end=end.next;
            }
        }

        return start;
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
        head = oddEven(head);
        displayll(head);
    }
}