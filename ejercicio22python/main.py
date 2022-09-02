from select import select
import tkinter
from tkinter import ttk
from tkinter import Label
def mostrar():
    monitor.config(text='{}'.format(selected.get()))
def reset():
    selected.set(None)
    monitor.config(text="")

window = tkinter.Tk()
selected= tkinter.StringVar()
selected.set(None)
perro1=ttk.Radiobutton(window, text='haku', value='haku', variable=selected, command=mostrar)
perro1.pack(ipadx=20, ipady=10, expand=True)
perro2=ttk.Radiobutton(window, text='cookie', value='cookie', variable=selected, command=mostrar)
perro2.pack(ipadx=20, ipady=10, expand=True)
perro3=ttk.Radiobutton(window, text='milo', value='milo', variable=selected, command=mostrar)
perro3.pack(ipadx=20, ipady=10, expand=True)
perro4=ttk.Radiobutton(window, text='barbie', value='barbie', variable=selected, command=mostrar)
perro4.pack(ipadx=20, ipady=10, expand=True)

monitor = Label(window)
monitor.pack(ipadx=20, ipady=10, expand=True)
boton_button = tkinter.Button(window, text="activar", command=reset)
boton_button.pack(ipadx=20, ipady=10, side='bottom')

window.mainloop()