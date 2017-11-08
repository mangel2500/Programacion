# -*- coding: cp1252 -*-
num=int(input("Dime cuantas palabras va a tener tu lista: "))

lista=[]

lista2=[]

for i in range (num):
     num1=raw_input('Dime una palabra %d: ' % (i+1))
     lista.append(num1)

print 'La lista creada es ' +str(lista)

numelim=int(input("Dime cuantas palabras tiene la lista de palabras a eliminar: "))

for i in range (numelim):
     num2=raw_input('Dime una palabra %d: ' % (i+1))
     lista2.append(num2)
     while num2 in lista:
         lista.remove(num2)

print 'La lista de palabras a eliminar es',lista2
     
print 'La lista es ahora',lista
