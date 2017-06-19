import java.util.*;
import java.io.*;
class Alphab
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    char a;
    a=sc.next().charAt(0);
    if(a>='a'&&a<='z'||a>='A'&&a<='Z')
    {
        System.out.println("Alphabet");
    }
    else
    {
        System.out.println("Not Alphabet");
    }
    
    }
    
}

