n = int(input())

for i in range(0, n):
    somatorio = 0
    a = input().split()
    x,y = a
    x = int(x)
    y = int(y)
    c = 0
    while c < y:
        if x % 2 != 0:
            somatorio += x
            c += 1
        x += 1
    print(somatorio)