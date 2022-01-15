def Permiso (x):
    if Contra==Respuesta:
        print("Contraseña correcta")
    else:
        print("Contraseña incorrecta")
        while Contra!=Respuesta:
            print("Insertar  contraseña:")
            Answer=input()
            if Contra==Answer:
                break
            else:
                print("Contraseña incorrecta")

Contra = "BIMMO12LORD" 
print("Inserte la contraseña:")
Respuesta=input()
Permiso(Respuesta)
print("Contraseña correcta, puede continuar")
print("Inserte dos valores para sumarlos")
z=int(input('Valor: '))
a=int(input('Valor: '))
z=z+a
print("Resultado {}".format(z))
    