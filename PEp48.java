import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) {
	    BigInteger sum = BigInteger.ZERO;
        BigInteger aim = new BigInteger("1000");
        int j=1;
        
        for(BigInteger i = BigInteger.valueOf(1);i.compareTo(aim)<=0;i=i.add(BigInteger.ONE)){
            BigInteger result = i.pow(j);
            sum = sum.add(result);
            j++;
        }
        System.out.println("Sum: "+sum);
	}
}
