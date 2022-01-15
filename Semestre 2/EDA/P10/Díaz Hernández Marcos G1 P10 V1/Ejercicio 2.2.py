Contra="BIMMO12LORD"
for z in range(10):
    print("Inserte la contraseña:")
    Respuesta=input()
    if Contra==Respuesta:
        print("Contraseña correcta, puede continuar")
        print("Inserte dos valores para sumarlos")
        z=int(input('Valor: '))
        a=int(input('Valor: '))
        z=z+a
        print("Resultado {}".format(z))
        break
    else:
        print("No puede continuar, le quedan {} intentos".format(9-z))
    if z==9: 
        break
        


    

