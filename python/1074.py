n = int(input())
i = 0

while i < n:
    numero = int(input())
    if numero % 2 == 0 and numero > 0:
        print("EVEN POSITIVE")
    elif numero % 2 != 0 and numero > 0:
        print("ODD POSITIVE")
    elif numero % 2 == 0 and numero < 0:
        print("EVEN NEGATIVE")
    elif numero % 2 != 0 and numero < 0:
        print("ODD NEGATIVE")
    else:
        print("NULL")
    i += 1