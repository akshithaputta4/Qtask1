class Add
{
    public void add(int... num)
    {
        String s="";
        int sum=0,i;
        for(i=0;i<num.length;i++)
        {
            if(i==num.length-1){
            s=s+Integer.toString(num[i]);
            }
            else{
                s=s+Integer.toString(num[i])+'+';
            }
            sum=sum+num[i];
        }
        s=s+"="+Integer.toString(sum);
        System.out.println(s);
    }
}

