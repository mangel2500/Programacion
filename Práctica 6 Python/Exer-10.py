# -*- coding: cp1252 -*-
numero=int(input("Dime cuantas palabras va a tener tu lista: "))

divisores = []

contador = 0

for i in range (1, numero+1):
    if numero % i ==0:
        divisores.append(i)
        i = i+1
        contador += 1

print numero,'tiene', contador,'divisores', divisores
