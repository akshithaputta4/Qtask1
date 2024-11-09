    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int i;
        for(i=1;i<=s.length()-k;i++)
        {
            String l=s.substring(i,i+k);
            if(l.compareTo(smallest)<0)
            {
                smallest=l;
            }
            if(l.compareTo(largest)>0)
            {
                largest=l;
            }
        }
        return smallest + "\n" + largest;
    }

