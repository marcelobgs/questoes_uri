continuar = True
media = 0
i = 0

while continuar == True:
    nota = float(input())
    if nota < 0 or nota > 10:
        print("nota invalida")
    else:
        i += 1
        media += nota
        if i == 2:
            print("media = {:.2f}".format(media/2))
            media = 0 
            i = 0
            while True:
                print("novo calculo (1-sim 2-nao)")
                novo = int(input())
                if novo == 1:
                    continuar = True
                    break
                elif novo == 2:
                    continuar = False
                    break