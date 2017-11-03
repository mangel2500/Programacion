
print("Introduce el numerolimite")
lim=int(input())

print("Introduce un valor")
num1=int(input())

num2=num1
lista=[num1]

while lim>num2:
    print("Introduce otro valor")
    num1=int(input())
    num2=num2+num1
    lista.append(num1)

lista.pop()   
print("El limite a superar es", lim, ".La lista creada es", lista)
