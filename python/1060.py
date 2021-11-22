i = 0
count = 0

while i < 6:
    numero = float(input())
    if numero >= 0:
        count += 1
    i += 1

print ("{} valores positivos".format(count))