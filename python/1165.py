n = int(input())

for i in range(0,n):
    num = int(input())
    somatorio = 0
    a = 1
    while a <= num:
        if num % a == 0:
            somatorio += 1
        a += 1
    if somatorio > 2:
        print('{} nao eh primo'.format(num))
    else:
        print('{} eh primo'.format(num))