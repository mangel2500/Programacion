'''MIGUEL ANGEL MENA ALCALDE - PRACTICA 7 EJERCICIO 4
Escribe un programa que pida una frase, y le pase como par�metro a
una funci�n dicha frase. La funci�n  debe  sustituir  todos  los
espacios  en  blanco de  una  frase  por  un  asterisco,  y  devolver
el resultado para que el programa principal la imprima por pantalla. '''

def cadena():
    frase=raw_input("Escribe una frase: ")
    valor= ' '
    for i in range(len(frase)):
        if frase[i] == ' ':
            valor+='*'
        else:
            valor+=frase[i]
    return valor
print cadena()

                   
        
