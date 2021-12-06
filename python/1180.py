n=int(input())

x = input()
x = x.split()

for i in range(len(x)):
    x[i] = int(x[i])

menor = x[0]
posicao = 0
for j in range(1,len(x)):
    if x[j] < menor:
        menor = x[j]
        posicao = j

print('Menor valor: {}'.format(menor))
print('Posicao: {}'.format(posicao))
