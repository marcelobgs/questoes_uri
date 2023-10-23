n = int(input())
for i in range(n):
    m = 0
    lesmas = input().split()
    for lesma in lesmas:
        if int(lesma) > m:
            m = int(lesma)
    if m <= 10:
        N = 1
    elif m > 10 and m < 20:
        N = 2
    else:
        N = 3
    print(N)
