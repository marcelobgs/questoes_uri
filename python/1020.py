idade = int(input())

ano = idade // 365
idade -= ano * 365

mes = idade // 30
idade -= mes * 30

dias = idade

print("{} ano(s)" .format(ano))
print("{} mes(es)" .format(mes))
print("{} dia(s)" .format(dias))