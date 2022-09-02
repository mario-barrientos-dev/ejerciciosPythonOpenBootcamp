class alumno:
    def registro(self,nombre,nota):
        self.nombre=nombre
        self.nota=nota
    def mostrar(self):
        print("Nombre: ", self.nombre)
        print("Nota: ", self.nota)
    def calificacion(self):
        if self.nota>5:
            print('Aprobado')
        else:
            print('No aprobado')

Alumno1 = alumno()
Alumno2 = alumno()

Alumno1.registro("Mario", 4)
Alumno1.mostrar()
Alumno1.calificacion()
Alumno2.registro("Johanna", 8)
Alumno2.mostrar()
Alumno2.calificacion()
