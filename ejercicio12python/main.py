def año_bisiesto(num):
    #soluciona el error del calendario gregoriano
    if num % 4 == 0:
        print("es año bisiesto")  
    else:
        print("no es año bisiesto")
    
año_bisiesto(1992)