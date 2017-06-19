import java.util.*;
import java.io.*;
class Positive
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a>0)
    {
        System.out.println("Positive");
    }
    else if(a==0)
    {
        System.out.println("zero");
    }
    else
    {
        System.out.println("negative");
    }
    
    }
    
}
