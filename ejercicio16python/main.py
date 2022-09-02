import time

Hora = time.strftime('%H')
Minutos = time.strftime('%M') 
print(Hora)
if int(Hora) >= 19:
	print ("Es hora de irse a casa") 
else:
	print ("Nos faltan {} horas y {} minutos para irnos a nuestra casa".format(18- int(Hora), 59-int(Minutos)))