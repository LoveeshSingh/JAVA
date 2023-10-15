import java.util.*;


public class dialpad
{
    static char[][] values=
    {
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r'},
        {'s','t','u'},
        {'v','w','x'},
        {'y','z'},
        {}
    };


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num =scan.next();
        System.out.println("All the permutations are: ");
        convertor(num,"");
    }

    public static void convertor(String num,String name)
    {
        if (num=="")
        {
            System.out.println(name);
            return;
        }
        else
        {
            int val = num.charAt(0) - '0';
            num=(num.length()>1)?(num.substring(1)):"";
            if (values[val].length>0)
            {
                for (int i=0 ; i<values[val].length ; i++)
                {
                    convertor(num,name+values[val][i]);
                }
            }
            else
            {
                convertor(num,name);
            }
            return;
        }
    }
}