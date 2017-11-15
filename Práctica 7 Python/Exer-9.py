'''MIGUEL ANGEL MENA ALCALDE - PRACTICA 7 EJERCICIO 9
Escribe un programa que pida dos palabras las pase como parámetro a un
procedimiento y diga si riman o no. Si coinciden las tres últimas letras
tiene que decir que riman. Si coinciden sólo las dos últimas tiene que
decir que riman un poco y si no, que no riman. '''

def palabra_uno():
    palab=raw_input("Dime una palabra de almenos 4 letras: ")
    return palab

def palabra_dos():
    palab2=raw_input("Dime otra palabra de almenos 4 letras: ")
    return palab2

def notresletras_palabra(palab1,palab2):
    flag=False
    if len(palab1) < 4 or len(palab2) < 4:
        flag=True
    return flag

def rima_palab(palabr1,palabr2):
    flag=False
    if palabr1[-3:] == palabr2[-3:]:
        flag=True
    return flag
        
def riman_poco(palabra1,palabra2):
    flag=False
    if palabra1[-2:] == palabra2[-2:]:
        flag=True
    return flag


def imprimir():
    if notresletras_palabra(a,b):
        print "Tu palabra tiene menos de 4 letras"
    elif rima_palab(a,b):
        print "Tus palabras riman"
    elif riman_poco(a,b):
        print "Tus palabras riman poco"
    else:
        print "Tus palabras no riman"

a = palabra_uno()
b = palabra_dos()
c = notresletras_palabra(a,b)
d = rima_palab(a,b)
e = riman_poco(a,b)
imprimir()
a
