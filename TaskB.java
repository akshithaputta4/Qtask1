import java.util.*;
public class CustomList
{
    int i;
    String s;
    public CustomList(int i,String s)
    {
        this.i=i;
        this.s=s;
    }
    @Override
    public String toString()
    {
        String o="number"+i+"name"+s;
        return o;
    }
}
class GenericMyList<T> {
    Object[] array;
    int size;
    public GenericMyList()
    {
        array=new Object[100];
        size=0;
    }
    public void add(T val)
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
    public void deleteByValue(T v)
    {
        for(int i=0;i<size;i++)
        {
            if(array[i].equals(v))
            {
                deleteByIndex(i);
                break;
            }
        }
    }
    public void getElement(int index)
    {
        if(index<0 || index>=size)
        {
            throw new IndexOutOfBoundsException("notfound");
        }
        System.out.println(array[index]);
    }
    public void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args)  {
        GenericMyList<String> m=new GenericMyList<>();
        GenericMyList<CustomList> c=new GenericMyList<>();
        GenericMyList<Integer> p=new GenericMyList<>();
        try{
        m.add("aks");
        m.add("as");
        m.deleteByIndex(0);
        m.deleteByValue("as");
        m.add("aks");
        m.add("as");
        m.getElement(1);
        m.print();
        CustomList t=new CustomList(1, "aks");
        c.add(t);
        c.print();
        p.add(1);
        p.add(2);
        p.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
