#include <stdio.h>

int main()
{
    int in = 1;
    
    for(int i=1;i<=20;i++){
        if(in%i!=0){
            in++;
            i = 1;
        }
    }
    printf("%d", in);

    return 0;
}
