import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int j;
            int m;
            m=a+(1*b);
            System.out.print(m+" ");
            for(j=1;j<n;j++)
            {
                m=m+((int)Math.pow(2,j)*b);
                System.out.print(m+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
