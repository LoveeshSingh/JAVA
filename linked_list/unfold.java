import java.util.*;

public class unfold{
    public static fold foldingOb = new fold();

    public static void unfoldll(fold.node start,fold.node end){
        if (start==null){
            return;
        }
        else if (start.next==null){
            return;
        }
        fold.node newptr = start.next;
        fold.node temp = start.next;
        while (start.next.next!=null){
            start.next=start.next.next;
            if (newptr.next.next!=null){
                newptr.next=newptr.next.next;
            }
            else{
                start=start.next;
                break;
            }
            start=start.next;
            newptr=newptr.next;
        }
        newptr.next=null;
        temp = foldingOb.reverse_iterativell(temp);
        start.next=temp;
    }


    public static void main(String[] args){
        String[] arr = new String[1];
        foldingOb.main(arr);  
        unfoldll(foldingOb.head,foldingOb.tail);
        System.out.println();
        foldingOb.displayll(foldingOb.head);
    }
}
