def factorial_no_recursivo(numero):
    fact = 1
    #Se genera una lista que ve de n a 1, el -1 indica que cada iteración se resta 1 al índice.
    for i in range(numero, 1, -1): 
        fact *= i   # Esto es equivalente a fact = fact * i
    return fact

def factorial_recursivo(numero):
    if numero < 2:    # El caso base es cuando numero < 2 y la función regresa 1
        return 1
    return numero * factorial_recursivo(numero - 1) # La función se llama a sí misma

print(factorial_no_recursivo(5))
print(factorial_recursivo(5))