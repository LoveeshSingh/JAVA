import java.util.*;

public class floyd_cycle{
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

    public static void removeCycle(node start){
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
        // here we hv slow and start pointing on end point

        slow.next=null;
    }

    public static void main(String[] args){
        add_lastll(1);
        add_lastll(2);
        add_lastll(2);
        add_lastll(4);
        add_lastll(4);
        add_lastll(4);
        add_lastll(4);
        add_lastll(4);
        add_lastll(5);
        tail.next=head;
        System.out.println();
        System.out.println(isCycle(head)?"true":"false");
        removeCycle(head);
        displayll(head);
    }
}