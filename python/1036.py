import math

x = input().split()
a, b, c = x

a = float(a)
b = float(b)
c = float(c)

if (a == 0 or b * b - 4 * a * c < 0):
    print("Impossivel calcular")
else:
    bascara = math.sqrt((b * b) - (4 * a * c))
    r1 = (-b + bascara)/(2 * a)
    r2 = (-b - bascara)/(2 * a)
    print("R1 = {:.5f}".format(r1))
    print("R2 = {:.5f}".format(r2))