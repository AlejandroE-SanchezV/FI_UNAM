def fibonacci_iterativo_v2(numero):
    f1=0
    f2=1
    for i in range(1, numero-1):
        f1,f2=f2,f1+f2    #Asignación paralela
    return f2

def fibonacci_iterativo_v1(numero):
    f1=0
    f2=1
    tmp=0
    for i in range(1,numero-1):
        tmp = f1+f2
        f1=f2
        f2=tmp
    return f2

def fibonacci_bottom_up(numero):
    f_parciales = [0, 1, 1]
    #Esta es la lista que mantiene las soluciones previamente calculadas
    while len(f_parciales) < numero:
        f_parciales.append(f_parciales[-1] + f_parciales[-2]) 
        #Busca de derecha a izquierda
        print(f_parciales)
    return f_parciales[numero-1]

print(fibonacci_bottom_up(6))
print(fibonacci_iterativo_v1(6))
print(fibonacci_iterativo_v2(6))