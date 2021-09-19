#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, char** argv) {
    int perimeter=3, count=0, compare=0, ans;
    
    while(perimeter<=1000){
        for(int i=1;i<=perimeter-2;i++){
            for(int j=1;j<=perimeter-2;j++){
                 if(pow(i,2)+pow(j,2)==pow(perimeter-i-j,2)){
                     count++;
                 }
            }
        }
        
        if(count>compare){
            compare = count;
            ans = perimeter;
        }
        
        count = 0;
        perimeter++;
    }
    
    printf("Answer: %d", ans);
    
    return (EXIT_SUCCESS);
}
