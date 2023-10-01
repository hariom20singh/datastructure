import java.util.Scanner;

public class Automorphic_Number
{
    public static boolean Auto_morph_no(int a)
    {
        int sq=(int)Math.pow(a,2);
        int rem=0,sum=0,i=0;
        int d = number_of_digits.nod(a);
        while(d!=0)
        {
            rem=sq%10;
            sum=sum+(rem*(int)Math.pow(10,i));
            sq=sq/10;
            i++;
            d--;
        }
        if(sum==a)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number to check if it's auto-morphic or not :- ");
        int n = sc.nextInt();
        if(Auto_morph_no(n))
            System.out.println(n+" is Auto-morphic");
        else
            System.out.println(n+" is not Auto-morphic");
    }
}
