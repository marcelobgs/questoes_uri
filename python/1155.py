i = 1
s = 1

for a in range(2, 101):
    s = s + (1/a)
    
print("{:.2f}".format(s))