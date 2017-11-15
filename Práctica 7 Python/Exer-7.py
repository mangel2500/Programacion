'''MIGUEL ANGEL MENA ALCALDE - PRACTICA 7 EJERCICIO 7
Escribe  un  programa  que  lea  una  frase,  y  la  pase  como parámetro
a  un  procedimiento.  El procedimiento  contará el  número  de  vocales
(de  cada una)  que  aparecen,  y  lo  imprimirá  por pantalla. '''

frase=raw_input("Escribe una frase: ")
def contadores(frase):
    contadora = 0
    contadore = 0
    contadori = 0
    contadoro = 0
    contadoru = 0
    for i in range(len(frase)):
        if frase[i] == 'a' :
            contadora+=1
        if frase[i] == 'e' :
            contadore+=1 
        if frase[i] == 'i' :
            contadori+=1
        if frase[i] == 'o' :
            contadoro+=1
        if frase[i] == 'u' :
            contadoru+=1
    return 'Hay ' + str(contadora) + ' a' , str(contadore) + ' e', str(contadori) + ' i', str(contadoro) + ' o', str(contadoru) + ' u'
print contadores(frase)


