import java.util.*;
public class Employee {
    String id;
    String name;
    int age;
    Date dateOfJoining;
    public Employee(String id,String name,int age,Date dateOfJoining)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.dateOfJoining=dateOfJoining;
    }
    @Override
    public String toString()
    {
        String s="Employee id"+id+"employee name"+name+"employee age"+age+"employee dateofjoining"+dateOfJoining;
        return s;
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
        GenericMyList<Employee> m=new GenericMyList<>();
        try{
        Calendar c=Calendar.getInstance();
        c.set(2024, 5, 15);
        Date dateOfJoining=c.getTime();
        Employee e1=new Employee("y21cs138", "akshitha", 21,dateOfJoining);
        m.add(e1);
        m.print();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
