'''MIGUEL ANGEL MENA ALCALDE - PRACTICA 7 EJERCICIO 3
Escribe  un  programa  que  lea  una  frase,  y  la  pase  como
par�metro  a  un  procedimiento,  y  �ste debe mostrar la frase
con un car�cter en cada l�nea.'''

def funcion():
    frase=raw_input("Escribe una frase: ")
    for i in range(0,len(frase)):
        print frase[i]
funcion()

