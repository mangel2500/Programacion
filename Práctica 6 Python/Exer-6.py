# -*- coding: cp1252 -*-
num=int(input("Dime cuantas palabras va a tener tu lista: "))

lista1=[]

lista2=[]

for i in range (num):
     num1=raw_input('Dime una palabra %d: ' % (i+1))
     lista1.append(num1)

print 'La lista creada es ', lista1

for i in lista1:
    lista2 = [i] + lista2
    
print 'La lista inversa es:', lista2


