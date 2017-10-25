print 'Dame un numero'
numero1=input()
print 'Dame otro numero mayor'
numero2=input()
print ''
if (numero2<numero1):
    print 'ERROR'
else :
    for a in range(numero1,numero2+1):
        if (a%2==0):
            print a ,'es par'
        else :
            print a ,'es impar'
