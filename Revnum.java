import java.util.*;
import java.io.*;
class Revnum
{
    public static void main(String args[])
    {
        int rever=0,t=0;
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        do
        {
            t=s%10;
            rever=rever*10+t;
            s=s/10;
        }while(s>0);
        System.out.println(rever);
    }
    
    
}
