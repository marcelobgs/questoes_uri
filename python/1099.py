n = int(input())


for i in range(0, n):
    somatorio = 0
    x = input().split()
    n1, n2 = x
    n1 = int(n1)
    n2 = int(n2)
    maior = n1 if n1 > n2 else n2
    menor = n2 if n2 < n1 else n1
    menor += 1
    
    while maior > menor:
        if menor % 2 != 0:
            somatorio += menor
        menor += 1
    print(somatorio)
    