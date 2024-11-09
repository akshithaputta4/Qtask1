import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        List<List<Integer>> arr=new ArrayList<>();
        int i,j;
        for(i=0;i<n;i++)
        {
            m=sc.nextInt();
            List<Integer> arr1=new ArrayList<>();
            for(j=0;j<m;j++)
            {
                arr1.add(sc.nextInt());
            }
            arr.add(arr1);
        }
        int s,a,b;
        s=sc.nextInt();
        for(i=0;i<s;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            try
            {
                System.out.println(arr.get(a-1).get(b-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
        
    }
}
