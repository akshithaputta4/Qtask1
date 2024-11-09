import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n,m,i;
        n=sc.nextInt();
        m=sc.nextInt();
        BitSet b1=new BitSet(n);
        BitSet b2=new BitSet(n);
        for(i=0;i<m;i++)
        {
            String s=sc.next();
            int o1=sc.nextInt();
            int o2=sc.nextInt();
            switch(s)
            {
                case "AND":
                if(o1==1)
                {
                    b1.and(b2);
                }
                else
                {
                    b2.and(b1);
                }
                break;
                case "OR":
                if(o1==1)
                {
                    b1.or(b2);
                }
                else
                {
                    b2.or(b1);
                }
                break;
                case "XOR":
                if(o1==1)
                {
                    b1.xor(b2);
                }
                else
                {
                    b2.xor(b1);
                }
                break;
                case "FLIP":
                if(o1==1)
                {
                    b1.flip(o2);
                }
                else
                {
                    b2.flip(o2);
                }
                break;
                case "SET":
                if(o1==1)
                {
                    b1.set(o2);
                }
                else
                {
                    b2.set(o2);
                }
                break;
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
    }
}
