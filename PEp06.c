#include <stdio.h>
#include <math.h>

int main()
{
    int sumsq = 0, sqsum, n = 100;
    
    for(int i=1;i<=n;i++){
        sumsq = sumsq + i * i;
    }
    
    sqsum = pow(n*(n+1)/2, 2);
    
    printf("%d", sqsum-sumsq);

    return 0;
}
