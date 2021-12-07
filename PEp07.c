#include <stdio.h>

int main()
{
    int flag = 0, th = 1, n = 2;
    
    while(th!=10001){
        n++;
        
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag = 1;
                break;
            }
        }
        
        if(flag==0){
            th = th + 1;
        }
        
        flag = 0;
    }
    printf("%d", n);

    return 0;
}
