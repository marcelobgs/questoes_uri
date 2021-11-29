i = True
somatorio = 0
total = 0

while i:
    idade = int(input())
    if idade < 0:
        i = False
    else:
        somatorio += idade
        total += 1

print("{:.2f}".format(somatorio/total))