x = int(input())
y = int(input())

maior = x if x > y else y
menor = y if y < x else x

for i in range(menor,maior + 1):
    if i % 5 == 2 or i % 5 == 3:
        print(i)