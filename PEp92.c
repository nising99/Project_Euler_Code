#include <stdio.h>
#include <stdbool.h>
#include <math.h>

int main()
{
    double next = 0;
    bool a = true;
    int count = 0;
    int n;
    
    for(int i=2;i<=10000000;i++){
        n = i;
        while(a==true){
            while(n!=0){
                next = next + pow(n%10, 2);
                n = n/10;
            }
            if(next==89){
                count++;
                next = 0;
                a = false;
            }
            else if(next==1){
                next = 0;
                a = false;
            }
            else{
                n = next;
                next = 0;
            }
        }
        a = true;
    }
    
    printf("%d", count);

    return 0;
}
