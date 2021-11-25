j = 0

while j != 1:
    x = input().split()
    n1, n2 = x
    n1 = int(n1)
    n2 = int(n2)
    
    if n1 == n2:
        j =1
    else:
        if n1 > n2:
            print("Decrescente")
        elif n1 < n2:
            print("Crescente")