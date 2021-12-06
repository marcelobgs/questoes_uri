vetorPar = []
vetorImpar = []
p = 0
im = 0

for i in range(15):
    x = int(input())
    if x % 2 == 0:
        vetorPar.append(x)
        p += 1
    if x % 2 != 0:
        vetorImpar.append(x)
        im += 1
    
    if p > 4:    
        for c in range(5):
            print('par[{}] = {}'.format(c,vetorPar[c]))
        vetorPar = []
        p = 0
            
    if im > 4:    
        for c in range(5):
            print('impar[{}] = {}'.format(c,vetorImpar[c]))
        vetorImpar = []
        im = 0

if im > 0:
    for i in range(im):
        print("impar[{}] = {}".format(i, vetorImpar[i]))

if p > 0:
    for i in range(p):
        print("par[{}] = {}".format(i, vetorPar[i]))