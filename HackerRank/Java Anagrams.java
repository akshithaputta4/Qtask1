    static boolean isAnagram(String a, String b) {
        // Complete the function
        String s=a.toUpperCase();
        String d=b.toUpperCase();
        char c;
        for(c='A';c<='Z';c++)
        {
            int i=countOccurrences(s,c);
            int j=countOccurrences(d,c);
            if(i!=j)
            {
                return false;
            }
        }
        return true;
    }
    static int countOccurrences(String str,char c)
    {
        int count=0;
        int i=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
            {
                count++;
            }
        }
        return count;
    }

