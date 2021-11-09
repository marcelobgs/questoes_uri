N = int(input())

hora = N // 3600
N -= hora * 3600

minuto = N // 60
N -= minuto * 60

sec = N

print('{}:{}:{}'.format(hora, minuto, sec))