n = int(input())
i = 0
c = 0
r = 0
s = 0

while i < n:
    x = input().split()
    numero, tipo = x
    if tipo == 'C':
        c = c + int(numero)
    if tipo == 'R':
        r = r + int(numero)
    if tipo == 'S':
        s = s + int(numero)
    
    total = c + r + s
    pC = (c / total) * 100
    pR = (r / total) * 100
    pS = (s / total) * 100
    
    i += 1

print("Total: {} cobaias".format(total))
print("Total de coelhos: {}".format(c))
print("Total de ratos: {}".format(r))
print("Total de sapos: {}".format(s))
print("Percentual de coelhos: {:.2f} %".format(pC))
print("Percentual de ratos: {:.2f} %".format(pR))
print("Percentual de sapos: {:.2f} %".format(pS))