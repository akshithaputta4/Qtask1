import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int t=A.length()+B.length();
        System.out.println(t);
        if(A.compareTo(B)>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        String y=A.substring(0,1).toUpperCase()+A.substring(1);
        String r=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(y+" "+r);
    }
}



