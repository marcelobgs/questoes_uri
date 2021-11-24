i = 1
maior = 0
posicaoMaior = 0

while i < 101:
    n = int(input())
    if n > maior:
        maior = n
        posicaoMaior = i
    i += 1
    
print (maior)
print (posicaoMaior)