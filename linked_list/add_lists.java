import java.util.*;

public class add_lists{
    public static node head1 = null;
    public static node tail1 = null;
    public static node head2 = null;
    public static node tail2 = null;
    public static node head3 = null;
    public static node tail3 = null;

    public static class node{
        public int value;
        public node next;
        public node(int value){
            this.value=value;
            this.next=null;
        }
    }

    public static void add_lastll1(int value){
        if (head1==null){
            head1 = new node(value);
            tail1 = head1;
            return;
        }
        else{
            node n = new node(value);
            tail1.next=n;
            tail1=n;
        }
    }

    public static void add_lastll2(int value){
        if (head2==null){
            head2 = new node(value);
            tail2 = head2;
            return;
        }
        else{
            node n = new node(value);
            tail2.next=n;
            tail2=n;
        }
    }

    public static void add_lastll3(int value){
        if (head3==null){
            head3 = new node(value);
            tail3 = head3;
            return;
        }
        else{
            node n = new node(value);
            tail3.next=n;
            tail3=n;
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

    public static node reverse_iterativell(node start){
        node flipper = null;
        while(start!=null){
            node temp = start.next;
            start.next=flipper;        // change tail to head before hand
            flipper = start;
            start=temp;
        }
        return flipper;
    }

    public static node addll(node list1,node list2){
        if (list1==null||list2==null){
            list1 = (list1==null)?list2:list1;
            return list1;
        }
        node rev1 = reverse_iterativell(list1);
        node rev2 = reverse_iterativell(list2);
        int carry = 0;
        while(rev1!=null||rev2!=null||carry!=0){
            int sum =(((rev1!=null)?rev1.value:0)+((rev2!=null)?rev2.value:0)+carry);
            add_lastll3(sum%10);
            rev1 = (rev1!=null)?rev1.next:null;
            rev2 = (rev2!=null)?rev2.next:null;
            carry = sum/10;
        }
        head3 = reverse_iterativell(head3);
        return head3;
        
    }

    public static void main(String[] args){
        add_lastll1(1);
        add_lastll1(2);
        add_lastll1(3);
        add_lastll1(4);
        add_lastll1(5);
        add_lastll1(6);
        add_lastll1(7);
        add_lastll1(8);
        add_lastll1(9);

        add_lastll2(1);
        add_lastll2(2);
        add_lastll2(3);
        add_lastll2(4);
        add_lastll2(5);
        add_lastll2(6);
        add_lastll2(7);
        add_lastll2(8);
        add_lastll2(9);
        displayll(head1);
        System.out.println();
        displayll(head2);
        node sum = addll(head1,head2);
        System.out.println();
        displayll(sum);


    }
}