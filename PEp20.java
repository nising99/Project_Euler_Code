import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) {
		BigInteger n = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.ZERO;
        
        for(BigInteger i = BigInteger.valueOf(1);i.compareTo(BigInteger.valueOf(100))<=0;i=i.add(BigInteger.ONE)){
            n = n.multiply(i);
        }
        
        while(n!=BigInteger.ZERO){
            sum = sum.add(n.mod(BigInteger.valueOf(10)));
            n = n.divide(BigInteger.valueOf(10));
        }
        
        System.out.println(sum);
	}
}
