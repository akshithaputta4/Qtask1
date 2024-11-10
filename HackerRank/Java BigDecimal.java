        for(int i=0;i<n;i++)
        {
            BigDecimal First=new BigDecimal(s[i]);
            int index=i;
            for(int j=i+1;j<n;j++)
            {
                BigDecimal Second=new BigDecimal(s[j]);
                if(Second.compareTo(First)==1)
                {
                    First=Second;
                    index=j;
                }
            }
            String temp=s[i];
            s[i]=s[index];
            s[index]=temp;
        }
