x = []

for i in range(10):
   valor = int(input())
   if valor <= 0:
        valor = 1
        x.insert(i, valor)
   else:
        x.insert(i,valor)
    
for i in range(len(x)):
    print("X[{}] = {}".format(i,x[i]))