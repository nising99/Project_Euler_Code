import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) {
	    BigInteger ten = BigInteger.valueOf(10);
        BigInteger limit;
        limit = ten.pow(999);
        
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger c;
        int term = 0;
        
        do{
            c = a.add(b);
            a = b;
            b = c;
            term++;
        }while(c.compareTo(limit)<=0);
        
        System.out.println(term+2);
	}
}
