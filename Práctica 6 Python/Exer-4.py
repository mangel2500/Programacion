# -*- coding: cp1252 -*-
num=int(input("Dime cuantas palabras va a tener tu lista: "))

lista=[]

for i in range (num):
     num1=raw_input('Dime una palabra %d: ' % (i+1))
     lista.append(num1)

print 'La lista creada es ' +str(lista)

elim=raw_input('Eliminar la palabra: ')
 
while elim in lista:
     lista.remove(elim)
       
print ('La lista es ahora',lista)



