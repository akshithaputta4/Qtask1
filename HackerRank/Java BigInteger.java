import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        String c=sc.nextLine();
        BigInteger a=new BigInteger(b);
        BigInteger d=new BigInteger(c);
        System.out.println(a.add(d));
        System.out.println(a.multiply(d));
    }
}
