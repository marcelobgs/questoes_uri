i = 1
j = 7

while i < 10:
    print("I={} J={}".format(i, j))
    j -= 1
    if j <= 4:
        i += 2
        j += 3