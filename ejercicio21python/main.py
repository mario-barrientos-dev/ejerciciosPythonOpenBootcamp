import tkinter

window = tkinter.Tk()
'''label_haku = tkinter.Label(window, text='Haku', bg='black', fg='white')
label_haku.pack(ipadx=20, ipady=10, expand=True)
label_cookie = tkinter.Label(window, text='Cookie', bg='black', fg='white')
label_cookie.pack(ipadx=20, ipady=10, expand=True)
label_milo = tkinter.Label(window, text='Milo', bg='black', fg='white')
label_milo.pack(ipadx=20, ipady=10, expand=True)
label_barbie = tkinter.Label(window, text='Barbie', bg='black', fg='white')
label_barbie.pack(ipadx=20, ipady=10, expand=True)'''

label_gatos = tkinter.Label(window, text='Mis gatos', bg='black', fg='white')
label_gatos.pack(ipadx=20, ipady=10, expand=True)

gatos=['tobias','tuchis','negro','pollo','merlina']
lista_gatos=tkinter.StringVar(value=gatos)
listagatos= tkinter.Listbox(window, listvariable=lista_gatos)
listagatos.pack(ipadx=20, ipady=10, expand=True)

'''boton_button = tkinter.Button(window, text="activar")
boton_button.pack(ipadx=20, ipady=10, side='bottom')'''

window.mainloop()