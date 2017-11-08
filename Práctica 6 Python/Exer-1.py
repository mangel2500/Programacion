# -*- coding: cp1252 -*-
print("Dime cuantas palabras va a tener tu lista:")
num=int(input())

lista=[]


for i in range (num):
     num1=raw_input('Dime una palabra %d: ' % (i+1))
     lista.append(num1)

print 'La lista creada es' +str(lista)
