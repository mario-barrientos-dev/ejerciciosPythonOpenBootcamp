import pickle

class mascota:
    patas=0
    bigotes=0
    
    def __init__(self, patas, bigotes):
        self.patas=patas
        self.bigotes=bigotes
    def mostrar(self):
        print (f'tengo {self.patas} y {self.bigotes} bigotes')

gato = mascota(4,100)
gato.mostrar()
f= open('mascotas.bin', 'w+b')
pickle.dump(gato, f)
f.close()
f=open('mascotas.bin', 'r+b')
mrCat=pickle.load(f)
f.close()
print(mrCat)
print(type(mrCat))
print(mrCat.mostrar())
