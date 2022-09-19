matriz = []
somaTotal = 0
media = 0
valor = int(input())
letra = input()

for i in range(12):
    linha = []
    for j in range(12):
        num = float(input())
        linha.append(num)
    matriz.append(linha)

if letra == 'S':
    for k in range(len(matriz)):
        somaTotal = somaTotal + matriz[k][valor]
    print("{:.1f}".format(somaTotal))
    
elif letra == 'M':
    for i in range(len(matriz)):
        somaTotal = somaTotal + matriz[i][valor]
    med = somaTotal/12
    print("{:.1f}".format(med))