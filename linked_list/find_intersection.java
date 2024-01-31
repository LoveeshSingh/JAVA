import java.util.*;

public class find_intersection{
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

    public static boolean isCycle(node start){
        node slow = start;
        node fast = start;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static node findCycle(node start){
        node slow = start;
        node fast = start;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if (slow==start){
            while (slow.next!=start){
                slow=slow.next;
            }
        }
        else{
            while(slow.next!=start.next){
                slow=slow.next;
                start=start.next;
            }
        }
        // here we hv slow pointing on end point
        return slow.next;
    }

    public static node findIntersection(node start1,node start2, node end){
        end.next=start2;
        node ptr = findCycle(start1);
        end.next=null;
        return ptr;
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
        node head2 = new node(9,new node(8,new node(7,new node(6,new node(5,head.next.next.next)))));
        node meetpt = findIntersection(head,head2,tail);
        displayll(meetpt);
    }
}