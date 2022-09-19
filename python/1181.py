matriz = []
valor = 0

indice = int(input())
operacao = input()
for i in range(12):
    linha = []
    for i in range(12):
        valor = float(input())
        linha.append(valor)
    matriz.append(linha)

som = 0

if operacao == 'S':
    for i in range(len(matriz)):
        if i == indice:
            som = sum(matriz[i])
            print("{:.1f}".format(som))

elif operacao == 'M':
    for i in range(len(matriz)):
        if i == indice:
            som = sum(matriz[i])
            print("{:.1f}".format(som/12))