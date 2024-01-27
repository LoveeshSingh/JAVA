import java.util.*;

public class is_palindrome{
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

    public static boolean isPalindrome(node start,node end){
        node mid = findMid(start,end);
        mid.next=reverse_iterativell(mid.next);
        node temp = mid.next;
        while(temp!=null){
            if (start.value!=temp.value){
                return false;
            }
            start=start.next;
            temp=temp.next;
        }
        return true;
    }

    public static void main(String[] args){
        add_lastll(1);
        add_lastll(2);
        add_lastll(3);
        add_lastll(4);
        add_lastll(5);
        add_lastll(4);
        add_lastll(3);
        add_lastll(2);
        add_lastll(1);
        displayll(head);
        if (isPalindrome(head,tail)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
}