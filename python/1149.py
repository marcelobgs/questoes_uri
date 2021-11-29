x = list(map(int, input().split()))
i = 1
somatorio = 0

while x[i] <= 0:
    if x[i] <= 0:
        i += 1
    if x[i] > 0:
        break
    
for c in range(0, x[i]):
    somatorio += x[0] + c
    
print(somatorio)