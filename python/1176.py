fibo = [0, 1]

p = 0
s = 1

for i in range(60):
    t = s + p
    fibo.append(t)
    p = s
    s = t
    
T = int(input())

for i in range(T):
    n = int(input())
    print("Fib({}) = {}".format(n, fibo[n]))