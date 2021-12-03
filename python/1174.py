x = []

for i in range(100):
    a = float(input())
    x.insert(i,a)
    
for i in range(len(x)):
    if x[i] <= 10:
        print("A[{}] = {:.1f}".format(i,x[i]))