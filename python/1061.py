diaInicio = input().split()
horaInicio = input().split()
diaFim = input().split()
horaFim = input().split()

dInicio, dFim = int(diaInicio[1]), int(diaFim[1])
hI, mI, sI = int(horaInicio[0]), int(horaInicio[2]), int(horaInicio[4])
hF, mF, sF = int(horaFim[0]), int(horaFim[2]), int(horaFim[4])

minuto_seg = 60
hora_seg = minuto_seg * 60
dia_seg = hora_seg * 24
i = sI + mI * minuto_seg + hI * hora_seg + dInicio*dia_seg
f = sF + mF * minuto_seg + hF * hora_seg + dFim*dia_seg

if i < f:
    tempo = f - i
    dias = int(tempo/dia_seg)
    tempo = tempo%dia_seg
    horas = int(tempo/hora_seg)
    tempo = tempo%hora_seg
    minutos = int(tempo/minuto_seg)
    tempo = tempo%minuto_seg
    segundos = tempo
    print('{} dia(s)\n{} hora(s)\n{} minuto(s)\n{} segundo(s)'.format(dias, horas, minutos, segundos))