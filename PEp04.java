public class Main{
  
  public static void main(String[] args) {
    int num, k=0, numr, compare=0;
        int[] num5 = new int[5];
        int[] num6 = new int[6];
        
        for(int i=100;i<=999;i++){
            for(int j=100;j<=999;j++){
                num = i * j;
                numr = num;
                
                if(num>=100000){
                    while(num!=0){
                        num6[k] = num%10;
                        num = num / 10;
                        k++;
                    }
                    
                    k=0;
                    
                    if((num6[0]==num6[5] && num6[1]==num6[4] && num6[2]==num6[3]) && (numr > compare)){
                        compare = numr;
                    }
                }else{
                    while(num!=0){
                        num5[k] = num%10;
                        num = num / 10;
                        k++;
                    }
                    
                    k=0;
                    
                    if((num5[0]==num5[4] && num5[1]==num5[3]) && (numr > compare)){
                        compare = numr;
                    }
                }
            }
        }
        System.out.println("Answer: "+compare);
  }
}
