import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        try{
        int a=sc.nextInt();
        int b=sc.nextInt();
        
            int c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
