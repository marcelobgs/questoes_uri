n = int(input())

for i in range(0, n):
    numero = int(input())
    i = 1
    somatorio = 0
    while i < numero:
        if numero % i == 0:
            somatorio = somatorio + i
        i = i + 1
    if somatorio == numero:
        print("{} eh perfeito".format(numero))
    else:
        print("{} nao eh perfeito".format(numero))
         