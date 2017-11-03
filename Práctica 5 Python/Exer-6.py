# -*- coding: cp1252 -*-
print 'Dame un numero'
num=input()

print 'Dame un numero mayor que',num
num2=input()

numeros = []

print 'Escribe un numero entre', num,'y', num2'
num3=input()


while num3 > num2 or num3 < num:
    print '', num3,'no esta entre', num,'y', num2
    num3=input()
numeros.append(num3)
    
print 'Escribe otro numero entre', num,'y', num2
num4=input()

while num4 > num2 or num4 < num :
    print '', num4,'no esta entre', num,'y', num2
    num4=input()
numeros.append(num4)

print 'Escribe que no este entre', num,'y', num2
num5=input()

while num5 <= num2 and num5 >= num :
    print '', num5,'si esta dentro de', num,'y', num2
    num5=input()
    

print 'Escribe que no este entre', num,'y', num2
num6=input()

while num6 <= num2 and num6 >= num :
    print '', num6,'si esta dentro de', num,'y', num2
    num6=input()

print 'Los numeros situados entre', num,'y', num2,'son', numeros
