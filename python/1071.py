x = int(input())
y = int(input())
somatorio = 0

if x > y:
    y += 1
    while y < x:
        if y % 2 != 0:
            somatorio += y
            
        y += 1
        
else:
    x += 1
    while x < y:
        if x % 2 != 0:
            somatorio += x
            
        x +=1
        
print(somatorio)