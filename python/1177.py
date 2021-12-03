n = []
num = int(input())
for i in range(1000):
    a = 0
    while a < num:
        n.append(a)
        a += 1  
    print("N[{}] = {}".format(i, n[i]))