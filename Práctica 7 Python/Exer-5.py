'''MIGUEL ANGEL MENA ALCALDE - PRACTICA 7 EJERCICIO 5
Escribe un programa que te pida una frase y una vocal, y pase estos datos
como parámetro a una función  que  se  encargará  de  cambiartodas  las
vocales  de  la  frase  por  la  vocal  seleccionada. Devolverá la función la
frase modificada, y el programa principal la imprimirá: '''

frase=raw_input("Escribe una frase: ")
vocal=raw_input("Dime una vocal: ")
def cadena(frase,vocal):
    vocales=['a','e','i','o','u']
    result=''
    for i in range(len(frase)):
        if frase[i] in vocales :
            result+=vocal
        else:
            result+=frase[i]
    return result
print 'La frase es ahora: ',cadena(frase,vocal)

