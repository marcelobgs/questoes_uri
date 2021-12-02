n = int(input())

for i in range(0,n):
    pa,pb,ga,gb = map(float, input().split())
    pa = int(pa)
    pb = int(pb)
    ano = 0
    while pb>=pa:
        pa = int(pa*(1 + ga/100))
        pb = int(pb*(1 + gb/100))
        ano = ano + 1
        ano += 1
    if ano >= 101:
        print("Mais de 1 seculo.")
    if ano <= 100:
        print("{} anos.".format(ano))
                
