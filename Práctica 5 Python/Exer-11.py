import random
import time

random.seed(time.time())

minim=int(raw_input("Valor minim:"))
maxim=int(raw_input("Valor maxim:"))

secret=random.randint(minim, maxim)

print "A veure si endivines un nombre sencer entre",minim,"i", maxim

print "Dame un numero:"
n=input()
if (n<secret):
    print "Es demasiado pequeño, vuelve a probarlo:"
    n=input()
else :
    print"El numero es correcto!" 
if(n>secret):
    print "Es demasiado grande, prueba otra vez:"
else :
    print"El numero es correcto!"
