import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i;
        int j;
        for(i=0;i<n;i++)
        {
            int t=sc.nextInt();
            a[i]=t;
        }
        int count=0;
        for(i=0;i<n;i++)
        {
            int sum=0;
            for(j=i;j<n;j++)
            {
                sum=sum+a[j];
                if(sum<0)
                {
                   count++; 
                }
            }
        }
        System.out.println(count);
    }
}
