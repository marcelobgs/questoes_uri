n = float(input())
i = 0

while i < n:
    x = input().split()
    x1, x2, x3 = x
    x1 = float(x1)
    x2 = float(x2)
    x3 = float(x3)
    
    media = ((x1 * 2) + (x2 * 3) + (x3 * 5))/10
    print("{:.1f}".format(media))
    i += 1