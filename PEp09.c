#include <stdio.h>
#include <math.h>

int main()
{
    int perimeter=1000;
    
    for(int i=1;i<=perimeter-2;i++){
        for(int j=1;j<=perimeter-2;j++){
            if(pow(i,2)+pow(j,2)==pow(perimeter-i-j,2)){
                printf("%d, %d\n", i, j);
            }
        }
    }

    return 0;
}
