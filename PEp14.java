import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) {
		BigInteger count = BigInteger.ONE;
        BigInteger in;
        BigInteger comparing = BigInteger.ZERO;
        BigInteger startnum = BigInteger.ZERO;
        
        for(BigInteger i = BigInteger.valueOf(1);i.compareTo(BigInteger.valueOf(1000000))<=0;i=i.add(BigInteger.ONE)){
            in=i;
            while(in.compareTo(BigInteger.ONE)==1){
                if(in.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO)==0){
                    in = in.divide(BigInteger.valueOf(2));
                }else{
                    in = in.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
                }
                count = count.add(BigInteger.ONE);
            }
            
            if(count.compareTo(comparing)==1){
                comparing = count;
                startnum = i;
            }
            
            count = BigInteger.ONE;
        }
        System.out.println("Starting number: "+startnum);
        System.out.println("Terms: "+comparing);
	}
}
