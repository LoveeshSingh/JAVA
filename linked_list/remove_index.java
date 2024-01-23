import java.util.*;

public class remove_index{
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
    public static void remove_indexll(node start,int index){
        if (start==null){
            System.out.println("no element to delete");
        }
        else if (index==0){
            if (head==tail){
                tail=null;
            }
            head=head.next;
        }
        else{
            int count=0;
            while(start.next!=null){
                count++;
                if (count==index){
                    if (start.next==tail){
                        tail=null;
                    }
                    start.next=start.next.next;
                    return;
                }
                start=start.next;
            }
            System.out.println("index not found");
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
        remove_indexll(head,6);
        System.out.println();
        displayll(head);
    }
}