import java.util.*;
public class Bank
{
    protected double defaultCharge=100.0;
    public double defaultTransactionCharge(double v)
    {
        return (defaultCharge+v);
    }
}
class Icici extends Bank
{
    double d;
    @Override
    public double defaultTransactionCharge(double v)
    {
        d=defaultCharge+v+(defaultCharge*0.50);
        return d;
    }
}
class Hdfc extends Bank
{
    double c;
    @Override
    public double defaultTransactionCharge(double v)
    {
        c=defaultCharge+v+(defaultCharge*0.75);
        return c;
    }
}
class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double v;
        System.out.println("Enter a value");
        v=sc.nextDouble();
        Bank b=new Bank();
        Icici i=new Icici();
        Hdfc h=new Hdfc();
        System.out.println("Default charges for bank"+b.defaultTransactionCharge(v));
        System.out.println("Icici bank charges"+i.defaultTransactionCharge(v));
        System.out.println("Hdfc bak charges"+h.defaultTransactionCharge(v));
        sc.close();
    }
}
