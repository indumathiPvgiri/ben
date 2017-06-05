import java.util.*;
import java.io.*;
class Facto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int i,fact=1;
        if(b>=0)
        {
        for(i=1;i<=b;i++)
        {
             fact=fact*i;
            }
            System.out.println(fact);
        }
            else
            {
                System.out.println("invalid");
            }
  
    }
    }
