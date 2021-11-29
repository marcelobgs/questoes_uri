x = int(input())
i = 0
t = []

while i < x:
    if i == 0 or i == 1:
        t.append(i)
    
    if i > 1:
        aux = t[i - 2] + t[i - 1]
        
        t.append(aux)
    i+=1
    
for j in range(0, x):
    t[j] = str(t[j])
    
t = ' '.join(t)
print(t)
