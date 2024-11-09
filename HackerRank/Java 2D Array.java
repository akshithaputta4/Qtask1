import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        int a;
        int b;
        int c=Integer.MIN_VALUE;
        for(a=0;a<4;a++)
        {
            for(b=0;b<4;b++)
            {
                int s=arr.get(a).get(b)+arr.get(a).get(b+1)+arr.get(a).get(b+2)+arr.get(a+1).get(b+1)+arr.get(a+2).get(b)+arr.get(a+2).get(b+1)+arr.get(a+2).get(b+2);
            if(s>c)
            {
                c=s; 
            }
        }
    }
    System.out.println(c);
    bufferedReader.close();
    }
}
