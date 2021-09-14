import java.math.BigInteger;

public class Main
{
	public static void main(String[] args) {
		BigInteger left; left = BigInteger.valueOf(1);
        BigInteger right; right = BigInteger.valueOf(1);
        int nr;
        BigInteger tnr; tnr = BigInteger.valueOf(1);
        BigInteger total;
        int count=0;
        BigInteger aim = new BigInteger("1000000");
        
        for(int i=1;i<=100;i++){
            for(int j=1;j<=i;j++){
                for(int k=1;k<=i;k++){                    
                    left = left.multiply(BigInteger.valueOf(k));
                }
                
                for(int l=1;l<=j;l++){
                    right = right.multiply(BigInteger.valueOf(l));
                }
                
                nr = i - j;
                if(nr==0){
                    nr=1;
                }
                
                for(int m=1;m<=nr;m++){
                    tnr = tnr.multiply(BigInteger.valueOf(m));
                }
                
                total = (left.divide(right)).divide(tnr);
                
                if(total.compareTo(aim)==1){
                    count++;
                }
                
                left = BigInteger.valueOf(1);
                right = BigInteger.valueOf(1);
                tnr = BigInteger.valueOf(1);
            }
        }
        System.out.println("Count: "+count);
	}
}
