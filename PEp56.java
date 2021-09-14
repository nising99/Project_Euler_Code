import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) {
	    BigInteger sum = BigInteger.ZERO;
        BigInteger ten = new BigInteger("10");
        BigInteger comparing = BigInteger.ZERO;
        BigInteger aim = new BigInteger("100");
        
        for(BigInteger i = new BigInteger("1");i.compareTo(aim)<=0;i=i.add(BigInteger.ONE)){
            for(int j = 1;j <= 100;j++){
                BigInteger in = i.pow(j);
                
                while(in.compareTo(BigInteger.ZERO)==1){
                    sum = sum.add(in.mod(ten));
                    in = in.divide(ten);                    
                }
                if(sum.compareTo(comparing)==1){
                    comparing = sum;
                }
                sum = BigInteger.ZERO;
            }
        }
        System.out.println(comparing);
	}
}
