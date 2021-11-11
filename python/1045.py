x = input().split()

a, b, c = x

a = float(a)
b = float(b)
c = float(c)

if a > b and a > c:
    a = a
    
elif b > a and b > c:
    aux = a
    a = b
    b = aux

else:
    aux = a
    a = c 
    c = aux

if a >= b + c:
    print("NAO FORMA TRIANGULO")

else:
    if a * a == (b * b) + (c * c):
        print("TRIANGULO RETANGULO")
    
    if a * a > (b * b) + (c * c):
        print("TRIANGULO OBTUSANGULO")
        
    if a * a < (b * b) + (c * c):
        print("TRIANGULO ACUTANGULO")
        
    if a == b == c:
        print("TRIANGULO EQUILATERO")
        
    if  a == b != c or a == c != b or b == c != a:
        print("TRIANGULO ISOSCELES")
        
