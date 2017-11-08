# -*- coding: cp1252 -*-
num=int(input("Dime cuantas palabras va a tener tu lista: "))

lista=[]

for i in range (num):
     num1=raw_input('Dime una palabra %d: ' % (i+1))
     lista.append(num1)

print 'La lista creada es ' +str(lista)

busc=raw_input('Sustituir la palabra: ')
sust=raw_input('Por la palabra: ')

for i in range(len(lista)):
    if lista[i] == busc:
        lista [i] = sust
print ('La lista es ahora',lista)
