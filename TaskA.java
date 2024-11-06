import java.util.Arrays;

public class MyList {
    int[] array;
    int size;
    public MyList()
    {
        array=new int[100];
        size=0;
    }
    public void add(int val)
    {
        if(size==array.length)
        {
            array=Arrays.copyOf(array, array.length*2);
        }
        array[size]=val;
        size++;
    }
    public void deleteByIndex(int index)
    {
        if(index<0 || index>=size)
        {
            throw new IndexOutOfBoundsException("indexoutofboundexception");
        }
        for(int i=index;i<size-1;i++)
        {
            array[i]=array[i+1];
        }
        size--;
        if(size>0 && size==array.length/4)
        {
            array=Arrays.copyOf(array, array.length/2);
        }
    }
    public void deleteByValue(int v)
    {
        for(int i=0;i<size;i++)
        {
            if(array[i]==v)
            {
                deleteByIndex(i);
                i--;
            }
        }
    }
    public int getElement(int index)
    {
        if(index<0 || index>=size)
        {
            throw new IndexOutOfBoundsException("notfound");
        }
        return array[index];
    }
    public void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args)  {
        MyList m=new MyList();
        try{
        m.add(10);
        m.add(50);
        m.deleteByIndex(0);
        m.deleteByValue(50);
        m.add(10);
        m.add(50);
        int s=m.getElement(1);
        System.out.println(s);
        m.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
