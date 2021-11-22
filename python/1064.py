i = 0
count = 0
somatorio = 0

while i < 6:
    numero = float(input())
    if numero > 0:
        count += 1
        somatorio = somatorio + numero
    i += 1

media = somatorio / count

print ("{} valores positivos\n{:.1f}".format(count, media))