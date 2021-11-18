x = input().split()

inicio, fim = x

inicio = int(inicio)
fim = int(fim)

if inicio == fim:
    print("O JOGO DUROU 24 HORA(S)")
    
elif inicio > fim:
    resu = 24 - (inicio - fim)
    print("O JOGO DUROU {} HORA(S)".format(resu))
    
elif fim > inicio:
    resu = fim - inicio
    print("O JOGO DUROU {} HORA(S)".format(resu))
    