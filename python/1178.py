x = float(input())
n = []

for i in range(100):
    n.append(x)
    x = x - (x/2)
    print("N[{}] = {:.4f}".format(i, n[i]))