    static int B;
    static int H;
    static boolean flag;
    static
    {
        Scanner s=new Scanner(System.in);
        B=s.nextInt();
        H=s.nextInt();
        if(H>0 && B>0)
        {
            flag=true;
        }
        else if(H<=0 || B<=0)
        {
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
