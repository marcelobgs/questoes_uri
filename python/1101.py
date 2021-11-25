j = 0

while j != 1:
    somatorio = 0
    x = input().split()
    m, n = x
    m = int(m)
    n = int(n)
    maior = m if m > n else n
    menor = n if n < m else m
    if m <=0 or n <=0:
        j = 1
    else:
        for i in range(menor, maior + 1):
            print("%d "%(i), end="")
            somatorio += i
            if i == maior:
                print ("Sum=%d" %(somatorio))
    