teste = True

while teste:
    somatorio = 0
    x = int(input())
    if x == 0:
        teste = False
    else:
        for i in range(x, x + 10):
            if i % 2 == 0:
                somatorio += i
        print(somatorio)
