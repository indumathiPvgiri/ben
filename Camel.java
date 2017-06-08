import java.util.*;
import java.io.*;
import java.util.Scanner;
class Camel 
{
  public static void main(String args[]) 
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String in = sc.nextLine();
    String r = "";
    char f = in.charAt(0);
     r = r + Character.toUpperCase(f);
     for (int i = 1; i < in.length(); i++) {
     char c = in.charAt(i);
      char p = in.charAt(i - 1);
       if (p == ' ') 
        {
          r = r + Character.toUpperCase(c);
        } 
          else 
         {
           r = r + c;
         }
        }
        System.out.println(r);
    }
}
