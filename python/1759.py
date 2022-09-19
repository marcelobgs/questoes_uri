N = int(input())
frase = ''

for i in range(N):
    frase += 'Ho'
    if i == (N - 1):
        frase += '!'
    else:
        frase += ' '

print(frase)