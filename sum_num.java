import java.util.Scanner;

public class sum_num{
    public static void main(String[] args){
        Scanner pointer = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = pointer.nextInt();
        int len=0;
        for(int i=1;i<num;i=i*10){
            len+=1;
        }
        int sum=0
        for (int j=0;j<len;j+=1){
            sum=num%10;
            num=num//10;
        }
        System.out.print("Enter a number: ");
    }
}