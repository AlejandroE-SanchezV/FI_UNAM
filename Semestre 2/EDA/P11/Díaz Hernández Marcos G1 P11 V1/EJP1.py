from string import ascii_letters , digits
from itertools import product

#Concatenar letas y dígitos en una sola cadena
caracteres = ascii_letters+digits

def buscador(con):
    
    #Archivo con todas las combinaciones generadas
    archivo = open("combinaciones.txt", "w") 
    
    if 3<= len(con) <= 4:   #Cantidad de elementos
        for i in range(3,5):
            for comb in product(caracteres, repeat = i): #Multiplicacion de los elementos
                #Se utiliza join() para concatenar los caracteres regresado por la función product().
                #Como join necesita una cadena inicial para hacer la concatenación, se pone una cadena vacía
                #al principio
                prueba = "".join(comb)
                #Escribiendo al archivo cada combinación generada
                archivo.write( prueba + "\n"  )
                if  prueba == con:
                    print('Tu contraseña es {}'.format(prueba))
                    #Cerrando el archivo
                    archivo.close()
                    break
    else:
        print('Ingresa una contraseña que contenga de 3 a 4 caracteres')


from time import time
t0 = time() 
con = '9HL2'
buscador(con)
print("Tiempos de ejecución {}".format(round(time()-t0, 6)))

