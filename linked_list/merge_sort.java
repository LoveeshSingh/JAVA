import java.util.*;

public class merge_sort{
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

    public static node findMid(node start){
        node fast = start;
        node slow = start;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static node mergeSort(node start){
        if (start==null||start.next==null){
            return start;
        }
        node mid = findMid(start);
        node list1 = start;
        node list2 = mid.next;
        mid.next=null;
        list1 = mergeSort(list1);
        list2 = mergeSort(list2);
        node list3 = null;
        node list3fix = null;
        while(list1!=null&&list2!=null){
            if (list3==null){
                list3=new node(list1.value>list2.value?list1.value:list2.value);
                list3fix=list3;
                if (list1.value>list2.value){
                    list1=list1.next;
                }
                else{
                    list2=list2.next;
                }
            }
            else{
                list3.next =new node(list1.value>list2.value?list1.value:list2.value);
                if (list1.value>list2.value){
                    list1=list1.next;
                }
                else{
                    list2=list2.next;
                }
                list3 = list3.next;
            }
        }
        if (list1!=null){
            list3.next=list1;
        }
        else{
            list3.next=list2;
        }
        return list3fix;
    }

    public static void main(String[] args){
        add_lastll(87);
        add_lastll(42);
        add_lastll(19);
        add_lastll(53);
        add_lastll(64);
        add_lastll(28);
        add_lastll(91);
        add_lastll(5);
        add_lastll(76);
        displayll(head);
        System.out.println();
        head = mergeSort(head);
        displayll(head);
    }
}