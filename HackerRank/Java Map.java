import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
        in.nextLine();
		int i;
        Map<String,String> arr=new HashMap<>();
        for(i=0;i<n;i++)
        {
            String s=in.nextLine();
            String c=in.nextLine();
            arr.put(s,c);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(arr.containsKey(s))
            {
                System.out.println(s+"="+arr.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
	}
}



