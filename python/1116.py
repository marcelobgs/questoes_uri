total = int(input())

for i in range(0,total):
    x = input().split()
    n1, n2 = x
    n1 = float(n1)
    n2 = float(n2)
    
    if n2 == 0:
        print ("divisao impossivel")
    elif n2 != 0:
        divisao = n1 / n2
        print("{:.1f}".format(divisao))