renda = float(input())

if renda < 2000.00:
    print("Isento")

elif 2000.01 <= renda <= 3000.00:
    imposto = (renda - 2000) * 0.08
    print("R$ {:.2f}".format(imposto))
    
elif 3000.01 <= renda <= 4500.00:
    imposto = ((renda - 3000) * 0.18) + 80
    print("R$ {:.2f}".format(imposto))
    
elif renda > 4500.00:
    imposto = ((renda - 4500.00) * 0.28) + 350
    print("R$ {:.2f}".format(imposto))