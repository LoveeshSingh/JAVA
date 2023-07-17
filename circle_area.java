import java.util.Scanner;
import java.lang.Math.*;

public class circle_area{
    public static void main(String[] args){
        Scanner pointer= new Scanner(System.in);
        System.out.print("Enter the radius ");
        int rad= pointer.nextInt();
        System.out.println("area of circle with radius "+rad+" is "+(Math.PI*Math.pow(rad,2)));
    }
}