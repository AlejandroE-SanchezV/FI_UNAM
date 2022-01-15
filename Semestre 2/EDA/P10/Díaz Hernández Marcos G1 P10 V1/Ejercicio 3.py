def Insertar(x,y,z):
    for x in range(5):
        Tareas[x]=int(input("Inserta la calificacion de tu tarea {}:".format(x+1)))
    for x in range(4):
        Examenes[x]=int(input("Inserta la calificacion de tu examen {}:".format(x+1)))
    for x in range(5):
        Practicas[x]=int(input("Inserta la calificacion de tu practica {}:".format(x+1)))
        
def Calif(x,y,z):
    for x in range(1,5):
        Tareas[0]+=Tareas[x]
        Practicas[0]+=Practicas[x]
    for x in range(1,4):
        Examenes[0]+=Examenes[x]
    Tareas[0]=Tareas[0]/5
    Practicas[0]=(Practicas[0]/5)*0.4
    Examenes[0]=(Examenes[0]/4)*0.6
    a=Examenes[0]
    return a + Practicas[0],a

def Puntos(x,y,z):
    if Tareas[0]>8.5:
        Examenes[0]=Examenes[0]+0.5
        print("Calificacion modificada :) ")
        return Examenes[0]+Practicas[0]
    elif Tareas[0]>7.0 and Tareas[0]<=8.5:
        print("No hay modificacion")
        return Examenes[0]+Practicas[0]
    elif Tareas[0]<=7.0:
        print("Calificacion modificada :( ")
        return Examenes[0]+Practicas[0]-0.5
       

print("El programa siguiente te ayuda a calcular tu promedio.")
Tareas=[0,1,2,3,4]
Examenes=[0,1,2,3]
Practicas=[0,1,2,3,4]
Insertar(Tareas,Practicas,Examenes)
Promedio,PromE=Calif(Tareas,Practicas,Examenes)
Promedio1=Puntos(Examenes,Tareas,Practicas)

print("Puntos de examenes 60%:{}. Puntos de practicas 40%:{}".format(PromE,Practicas[0]))
print("Tu calificacion es:{}".format(Promedio))
print("Tu promedio de tareas:{}".format(Tareas[0]))
print("Tu promedio final es:{}".format(Promedio1))