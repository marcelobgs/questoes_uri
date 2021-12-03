x = []

for i in range(20):
    n = int(input())
    x.insert(i,n)

for i in range(20):
    print("N[{}] = {}".format(i,x[19 - i]))