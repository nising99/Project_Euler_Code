result = 0
n = 2**1000

while(n!=0):
    result = result + n % 10
    n = n//10
    
print(result)
