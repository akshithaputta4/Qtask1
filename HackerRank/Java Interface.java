class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
    {
        int sum=0,i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}
