def fibonacci_recursivo(numero):
    if numero == 1:     #Caso base 
        return 0
    if numero == 2 or numero == 3:
        return 1
    return fibonacci_recursivo(numero-1) + fibonacci_recursivo(numero-2) #Llamada recursiva

#Memoria inicial
memoria = {1:0, 2:1, 3:1}
def fibonacci_memo(numero):
    if numero in memoria:      #Si el número ya se encuentra calculado, se regresa el valor ya no se hacen más cálculos
        return memoria[numero]
    memoria[numero] = fibonacci_memo(numero-1) + fibonacci_memo(numero-2)
    return memoria[numero]  

print(fibonacci_memo(15))
print(memoria)
print(fibonacci_recursivo(13))