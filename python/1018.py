valor = int(input())

print(valor)

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

notas1 = valor // 1
valor -= notas1 * 1

print("{} nota(s) de R$ 100,00".format(notas100))
print("{} nota(s) de R$ 50,00".format(notas50))
print("{} nota(s) de R$ 20,00".format(notas20))
print("{} nota(s) de R$ 10,00".format(notas10))
print("{} nota(s) de R$ 5,00".format(notas5))
print("{} nota(s) de R$ 2,00".format(notas2))
print("{} nota(s) de R$ 1,00".format(notas1))