#include <stdio.h>

int main()
{
    int suma=0,sumb=0;
    
    for(int i=1;i<10000;i++){
        for(int j=1;j<i;j++){
            if(i%j==0){
                suma=suma+j;
            }
        }
        
        for(int k=1;k<suma;k++){
            if(suma%k==0){
                sumb=sumb+k;
            }
        }
        
        if(sumb==i){
            printf("%d, %d\n", suma, sumb);
        }
        
        suma=0;
        sumb=0;
    }

    return 0;
}
