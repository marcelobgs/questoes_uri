x = int(input())
y = int(input())
count = 0

maior = x if x > y else y
menor = y if y < x else x

for i in range(menor, maior + 1):
    if i % 13 != 0:
        count += i
        
print(count)
