A = float(input())
B = float(input())
C = float(input())

areaTri = (A * C)/2
areaCir = 3.14159 * C**2
areaTra = ((A + B) * C)/2
areaQuad = B**2
areaReta = A*B

print("TRIANGULO: {:.3f}".format(areaTri))
print("CIRCULO: {:.3f}".format(areaCir))
print("TRAPEZIO: {:.3f}".format(areaTra))
print("QUADRADO: {:.3f}".format(areaQuad))
print("RETANGULO: {:.3f}".format(areaReta))