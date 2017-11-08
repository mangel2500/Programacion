# -*- coding: cp1252 -*-
num=int(input("Dime cuantas palabras va a tener tu lista: "))

lista1=[]

lista2=[]

for i in range (num):
     num1=raw_input('Dime la palabra %d: ' % (i+1))
     lista1.append(num1)

print 'La lista primera lista es ' +str(lista1)

nume2=int(input("Dime cuantas palabras tiene la segunda lista: "))

for i in range (nume2):
     num3=raw_input('Dime la palabra %d: ' % (i+1))
     lista2.append(num3)

print 'La segunda lista es',lista2

comunes = []

for i in lista1:
    if i in lista2:
        comunes.append(i)
        
print "Palabras que aparecen en las dos listas:", comunes

sololista1 = []

for i in lista1:
    if not i in lista2:
        sololista1.append(i)
        
print "Palabras que aparecen solo en la primera lista",sololista1


sololista2 = []

for i in lista2:
    if not i in lista1:
        sololista2.append(i)
        
print "Palabras que aparecen solo en la segunda lista",sololista2

todas = comunes + sololista1 + sololista2
print "Todas las palabras:", todas
