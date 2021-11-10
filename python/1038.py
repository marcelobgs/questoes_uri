x = input().split()

codigo, quant = x

codigo = int(codigo)
quant = int(quant)

if codigo == 1:
    total = 4.00 * quant
    print("Total: R$ {:.2f}".format(total))

elif codigo == 2:
    total = 4.50 * quant
    print("Total: R$ {:.2f}".format(total))

elif codigo == 3:
    total = 5.00 * quant
    print("Total: R$ {:.2f}".format(total))

elif codigo == 4:
    total = 2.00 * quant
    print("Total: R$ {:.2f}".format(total))

elif codigo == 5:
    total = 1.50 * quant
    print("Total: R$ {:.2f}".format(total))
