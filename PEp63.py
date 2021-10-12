count = 0
a = True
power = 2

for i in range(1,10):
  while(a==True):
    if (pow(i, power) >= pow(10, power-1)) and (pow(i, power) < pow(10, power)):
      count = count + 1
      power = power + 1
    else:
      a = False
  a = True
  power = 2

print(str(count)+" + 9 ((1 to 9)^1)")
