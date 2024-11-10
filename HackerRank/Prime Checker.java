import java.lang.*;
import static java.lang.System.in;
class Prime {
    public void checkPrime(int ... numbers) {
        StringBuilder message = new StringBuilder();
        for (int number : numbers) {
            if (BigInteger.valueOf(number).isProbablePrime(1)) {
                 message.append(number).append(" ");
            }
        }
        System.out.println(message.toString().trim());
    }   
}
