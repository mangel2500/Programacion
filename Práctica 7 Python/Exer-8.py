'''MIGUEL ANGEL MENA ALCALDE - PRACTICA 7 EJERCICIO 8
Escribe un programa que pida una frase, y pase la frase como parámetro a
una función que debe  eliminarlos espacios en blanco (compactar la frase).
El programa principal imprimirá por pantalla el resultado final.'''


def frase_texto():
    frase=raw_input('Escribe una frase: ')
    return frase


def elim_espacios(frase):
    espacio = ''
    for i in range(len(frase)):
        if frase[i] == ' ':
            espacio+=''
        else:
            espacio+=frase[i]
    return espacio


texto = frase_texto()
print (elim_espacios(texto))
