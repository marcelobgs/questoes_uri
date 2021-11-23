x = int(input())
i = 1

while i < x + 1:
    if i % 2 == 0:
        numero = i * i
        print("{}^2 = {}".format(i, numero))
    i += 1
    
