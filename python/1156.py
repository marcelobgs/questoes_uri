i = 1
s = 0

for j in range(1,40,2):
    s = float(s + j/i)
    i *=2

print("{:.2f}".format(s))
        