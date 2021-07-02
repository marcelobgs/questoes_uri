linha1 = input().split(" ")
linha2 = input().split(" ")

codigoPeca1, numeroPeca1, valorPeca1 = linha1
codigoPeca2, numeroPeca2, valorPeca2 = linha2

valorTotal = (int(numeroPeca1) * float(valorPeca1)) + (int(numeroPeca2) * float(valorPeca2))

                                           
print("VALOR A PAGAR: R$ {:.2f}".format(valorTotal))