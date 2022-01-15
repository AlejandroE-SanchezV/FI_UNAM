#Primero
def funcion1 (l):
    if l==[]:
        return 1
    elif len(l)==1:
        return l[0]
    else:
        return l[0]*funcion1(l[1:])

lista1=[1,2,3,4,5,6,7,8]
lista2=funcion1(lista1)
print(lista2)

#Segundo
def funcion3 (l,n):
    if n==1:
        return l[0]
    else:
        return l[0] + funcion3(l[1:],n-1)

lista1=[1,2,3,4,5,6,7,8]
n=len(lista1)
lista2=funcion3(lista1,n)
print(lista2)

#Tercero 
def move(n,x,y,z):
    if n==1:
        print('move',x,'to',y)
    else:
        move(n-1,x,y,z)
        print('move',x,'to',y)
        move(n-1,z,y,x)

move(10,"A","B","C")

#Cuarto
def misterio(S):
    N=S.split()
    print(N)
    N=''.join(N)
    print(N)
    if len(N)== 1 or len(N)==0:
        return True
    else:
        if N[0]==N[-1] and misterio(N[1:-1]):
            print("Ideal: {}".format(N))
            return True
        else:
            return False

test = input("Ingresa una cadena\n")
print(misterio(test))


        