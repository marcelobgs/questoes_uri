x = int(input())
i = 0
countIn = 0
countOut = 0

while i < x:
    numero = int(input())
    if 10 <= numero <= 20:
        countIn += 1
    else:
        countOut += 1
    i += 1
    
print("{} in\n{} out".format(countIn, countOut))