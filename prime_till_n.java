import java.util.Scanner;


public class prime_till_n{
    public static void main(String[] args){
        Scanner pointer = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = pointer.nextInt();
        System.out.println("All the prime numbers till " + n + " are ");
        for (int i = 2,j=0 ; j<n ; i++ ){
            int num = 1;
            for (int k=2 ; k<=i/2 ; k++){
                if (i%k==0){
                    num=0;
                    break;
                }
            }
            if (num!=0){
                System.out.print(i + " ");
                j+=1;
            }
        }
    }
}

