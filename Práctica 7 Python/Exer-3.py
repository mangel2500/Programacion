'''MIGUEL ANGEL MENA ALCALDE - PRACTICA 7 EJERCICIO 3
Escribe  un  programa  que  lea  una  frase,  y  la  pase  como
parámetro  a  un  procedimiento,  y  éste debe mostrar la frase
con un carácter en cada línea.'''

def funcion():
    frase=raw_input("Escribe una frase: ")
    for i in range(0,len(frase)):
        print frase[i]
funcion()

