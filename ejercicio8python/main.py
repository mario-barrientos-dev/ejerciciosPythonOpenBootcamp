numero_inicial=input("Ingrese un numero para empezar: ")
numero_final=input("Ingrese un numero para terminar: ")
numeros_impares= []


while int(numero_final)<=int(numero_inicial) :
    numero_final=input("Ingrese un numero mayor al inicial para terminar: ")
for i in range(int(numero_inicial), int(numero_final) +1):
    if(i%2!=0):
        numeros_impares.append(i)
print (numeros_impares)