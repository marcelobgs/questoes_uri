n = int(input())
x = 1
for i in range(0,n):
    print("{} {} {}".format(x, x*x, x*x*x))
    print("{} {} {}".format(x, (x*x)+1, (x*x*x)+1))
    x += 1