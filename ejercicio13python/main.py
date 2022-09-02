class Vehiculo:
    color = "rojo"
    ruedas = "4"
    puertas = "4"
class Coche(Vehiculo):
    Velocidad = "100km"
    Cilindrada = "400"

Carrito = Coche()
print (Carrito.color)