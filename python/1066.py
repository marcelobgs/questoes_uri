i = 0
countPares = 0
countImpares = 0
countPositivo = 0
countNegativo = 0

while i < 5:
    numero = float(input())
    if numero %2 == 0:
        countPares += 1
    if numero % 2 != 0:
        countImpares += 1
    if numero > 0:
        countPositivo += 1
    if numero < 0:
        countNegativo += 1
    i += 1


print ("{} valor(es) par(es)\n{} valor(es) impar(es)\n{} valor(es) positivo(s)\n{} valor(es) negativo(s)".format(countPares, countImpares, countPositivo, countNegativo))