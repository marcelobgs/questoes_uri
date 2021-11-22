i = 0
count = 0

while i < 5:
    numero = float(input())
    if numero %2 == 0:
        count += 1
    i += 1


print ("{} valores pares".format(count))