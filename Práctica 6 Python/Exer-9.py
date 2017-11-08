# -*- coding: cp1252 -*-
num=int(input("Dime cuantas palabras va a tener tu lista: "))

lista1=[]

for i in range (num):
     num1=raw_input('Dime la palabra %d: ' % (i+1))
     lista1.append(num1)

print 'La lista creada es ',lista1

for i in range(len(lista1)-1,-1,-1):
    if lista1[i] in lista1[:i]:
            del(lista1[i])

print 'La lista sin repeticiones es:',lista1

