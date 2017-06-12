import java.util.*;
import java.io.*;
import java.util.Arrays;
class Uniqu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
int i,j,value=0;
for(i=0;i<b.length;i++)
{
b[i]=sc.nextInt();
value=value^b[i];
}
System.out.println(value);
}
}


