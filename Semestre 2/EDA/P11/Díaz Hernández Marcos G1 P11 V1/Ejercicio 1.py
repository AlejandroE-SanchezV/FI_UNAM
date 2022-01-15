import sys
def actividades (S, F, n):
    print("Actividades seleccionadas")
    i=0
    print("A{}".format(i+1))
    for j in range(1,n):
        if S[j] >= F[i]:
            print("A{}".format(j+1))
            i=j

S=[1,2,3,2,4,5,6,8,7]
F=[4,5,6,8,6,7,7,12,9]
a=sys.getsizeof(S)+116 #Toma valores de la lista y de cada elemento, hago ajuste
b=sys.getsizeof(S[0])
n=a//b
print(a,b,n)
actividades(S,F,n)
    
