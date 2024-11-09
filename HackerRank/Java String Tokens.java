import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String r="[ !,?._'@]+";
        String[] k=s.split(r);
        int c=0;
        int i;
        for(i=0;i<k.length;i++)
        {
            if(!k[i].isEmpty()){
            c=c+1;
            }
        }
        System.out.println(c);
        for(i=0;i<k.length;i++)
        {
            if(!k[i].isEmpty()){
            System.out.println(k[i]);
            }
        }
        
        scan.close();
    }
}

