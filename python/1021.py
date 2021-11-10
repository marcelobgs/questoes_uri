valor = float(input())

notas100 = valor // 100
valor -= notas100 * 100

notas50 = valor // 50
valor -= notas50 * 50

notas20 = valor // 20
valor -= notas20 * 20

notas10 = valor // 10
valor -= notas10 * 10

notas5 = valor // 5
valor -= notas5 * 5

notas2 = valor // 2
valor -= notas2 * 2

moeda1 = valor // 1
valor -= moeda1 * 1

moeda050 = valor // 0.50
valor -= moeda050 * 0.50

moeda025 = valor // 0.25
valor -= moeda025 * 1

moeda010 = valor // 0.10
valor -= moeda010 * 0.10

moeda005 = valor // 0.05
valor -= moeda005 * 0.05

moeda001 = valor // 0.01
valor -= moeda001 * 0.01

print("NOTAS:")
print("{} nota(s) de R$ 100.00".format(int(notas100)))
print("{} nota(s) de R$ 50.00".format(int(notas50)))
print("{} nota(s) de R$ 20.00".format(int(notas20)))
print("{} nota(s) de R$ 10.00".format(int(notas10)))
print("{} nota(s) de R$ 5.00".format(int(notas5)))
print("{} nota(s) de R$ 2.00".format(int(notas2)))

print("MOEDAS:")
print("{} moeda(s) de R$ 1.00".format(int(moeda1)))
print("{} moeda(s) de R$ 0.50".format(int(moeda050)))
print("{} moeda(s) de R$ 0.25".format(int(moeda025)))
print("{} moeda(s) de R$ 0.10".format(int(moeda010)))
print("{} moeda(s) de R$ 0.05".format(int(moeda005)))
print("{} moeda(s) de R$ 0.01".format(int(moeda001)))