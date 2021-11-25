countA = 0
countG = 0
countD = 0
tipo = 0
while tipo != 4:
    tipo = int(input())
    
    if tipo == 1:
        countA +=1
    elif tipo == 2:
        countG += 1
    elif tipo == 3:
        countD += 1
        
print("MUITO OBRIGADO")
print("Alcool: {}".format(countA))
print("Gasolina: {}".format(countG))
print("Diesel: {}".format(countD))
        