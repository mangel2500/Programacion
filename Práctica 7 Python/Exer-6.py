'''MIGUEL ANGEL MENA ALCALDE - PRACTICA 7 EJERCICIO 6
Escribe un programa que lea el nombre de una persona y un car�cter,
le pase estos datos a una funci�n  que  comprobar� si  dicho
car�cter  est�  en  su  nombre.  El  resultado  de  dicha  funci�n
lo imprimir� el programa principal por pantalla. '''

nombre=raw_input("Escribe un nombre: ")
caracter=raw_input("Dime un caracter: ")
def cadena(nombre,caracter):
    result=''
    for i in range(len(nombre)):
        if nombre[i] == caracter:
            return 'Si se encuentra el caracter en el nombre'
    return 'No se encuentra el caracter en el nombre'
print cadena(nombre,caracter)

