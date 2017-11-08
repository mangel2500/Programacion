# -*- coding: cp1252 -*-
num=int(input("Dime cuantas palabras va a tener tu lista: "))

lista=[]


for i in range (num):
     num1=raw_input('Dime una palabra %d: ' % (i+1))
     lista.append(num1)

print 'La lista creada es ' +str(lista)

cont = 0

pal = raw_input("Dime la palabra: ")

if pal in lista:
    print pal,'aparece en la lista',lista.count(pal),'veces'
else:
    print 'La palabra no existe en la lista'
