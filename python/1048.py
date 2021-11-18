salario = float(input())

if salario >= 400.00:
    reajuste = salario * 0.15
    novoSalario = salario + reajuste
    porcentagem = 15
    

if 400.01 <= salario <= 800.00:
    reajuste = salario * 0.12
    novoSalario = salario + reajuste
    porcentagem = 12

if 800.01 <= salario <= 1200.00:
    reajuste = salario * 0.10
    novoSalario = salario + reajuste
    porcentagem = 10

if 1200.01 <= salario <= 2000.00:
    reajuste = salario * 0.07
    novoSalario = salario + reajuste
    porcentagem = 7
    
if salario > 2000.00:
    reajuste = salario * 0.04
    novoSalario = salario + reajuste
    porcentagem = 4
    
print("Novo salario: {:.2f}".format(novoSalario))
print("Reajuste ganho: {:.2f}".format(reajuste))
print("Em percentual: {} %".format(porcentagem))