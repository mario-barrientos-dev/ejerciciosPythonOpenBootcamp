def el_numero_es_primo(num):
    for numeros in range(2, num):
        if num % numeros == 0:
            print("No es primo", numeros, "es divisor")
            return False
    print("Es primo")
    
el_numero_es_primo(1778931)