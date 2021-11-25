i = 0
media = 0

while i != 2:
    nota = float(input())
    if nota < 0 or nota > 10:
        print("nota invalida")
    else:
        i += 1
        media += nota
        
media = media /2
print("media = {:.2f}".format(media))
    