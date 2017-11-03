
print("Introduce el numero limite:")
lim=int(input())

print("Introduce un valor:")
num1=int(input())

lista=[]

while num1>lim:
    print(num1,'es mas grande,introduce otro numero: ')
    num1=int(input())
lim=lim-num1
lista.append(num1)

while lim > 0:
    print('Dime otro numero: ')
    num1=int(input())

    while num1>lim:
        print(num1,'es demasiado grande,dime otro numero: ')
        num1=int(input())
    lim=lim-num1
    lista.append(num1)

print ("El limite a alcanzado", lim, ".La lista creada es", lista)
