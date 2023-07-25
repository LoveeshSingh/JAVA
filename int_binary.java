import java.util.Scanner;

public class int_binary{
    public static void main(String[] args){
        Scanner pointer = new Scanner(System.in);
        System.out.println("1. Integer to Binary\n2. Binary to Integer");
        int choice = pointer.nextInt();
        System.out.print("Enter the digits: ");
        int num = pointer.nextInt();
        String fin;
        if (choice==1){
            fin = int_bin(num);
        }
        else if (choice==2){
            fin = bin_int(num);
        }
        else{
            System.out.print("Wrong choice");
            return;
        }
        System.out.println("Your digits were " + num + "\nAfter conversion it becomes " + fin);
    }
    
    public static String int_bin(int num){
        StringBuilder n = new StringBuilder("");
        int i;
        while (num != 0){
            i = num%2;
            if (i==1){
                n.append('1');
            }
            else if (i==0){
                n.append('0');
            }
            num = num/2;
        }
        String number = (n.reverse()).toString();
        return number;
    }

    public static String bin_int(int num){
        int len =(int)(Math.log10(num)+1);  
        int num1 = 0; 
        for (int j,i = 0 ; i<len ; i++){
            j=num%10;
            num1 += j*Math.pow(2,i);
            num=num/10;
        }
        String num2 = Integer.toString(num1);
        return num2;
        
    }


}