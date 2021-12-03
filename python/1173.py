x = []
n = int(input())
for i in range(10):
    x.insert(i,n)
    n = n * 2
    
for i in range(len(x)):
    print("N[{}] = {}".format(i,x[i]))