import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,o;
        o=sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        int i,j;
        for(i=0;i<o;i++)
        {
            arr.add(sc.nextInt());
        }
        int  m;
        m=sc.nextInt();
        for(i=0;i<m;i++)
        {
            String a;
            a=sc.next();
            if(a.equals("Insert"))
            {
                n=sc.nextInt();
                j=sc.nextInt();
                arr.add(n,j);
            }
            else
            {
                n=sc.nextInt();
                arr.remove(n);
            }
        }
        for(i=0;i<arr.size();i++)
        {
            
            System.out.print(arr.get(i)+" ");
            
        }
    }
}
