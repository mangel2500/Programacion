# -*- coding: cp1252 -*-
num=int(input("Dime cuantas palabras va a tener tu lista: "))

lista1=[]

lista2=[]

for i in range (num):
     num1=raw_input('Dime la palabra %d: ' % (i+1))
     lista1.append(num1)

print 'La lista creada es ',lista1

lista2 = sorted(lista1)

print 'La lista ordenada es:', lista2


