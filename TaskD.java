import java.util.*;
public class SingleDigitException extends Exception
{
    public SingleDigitException(String s)
    {
        super(s);
    }
}
class CustomException
{
    public void singleDigitValidation(int num) throws SingleDigitException
    {
        if(num<-9 || num>9)
        {
            throw new SingleDigitException("num should be single digit");
        }
        else{
            System.out.println(num);
        }
    }
}
class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int s;
        s=sc.nextInt();
        try
        {
            CustomException c=new CustomException();
            c.singleDigitValidation(s);
        }
        catch(SingleDigitException e)
        {
            System.out.println(e);
        }
        finally{
            sc.close();
        }
    }
}
