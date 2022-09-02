paises = input('agrega paises continuados por comas: ')
lista_paises = [pais for pais in paises.split(',')]
lista_paises = (','.join(set(sorted(list(lista_paises)))))

print(lista_paises)