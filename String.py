#UNIDAD 1: Variables y tipos de datos (String)
#primer_parcial=float(input("Ingrese calificacion 1:"))
#segundo_parcial=float(input("Ingrese calificacion 2:"))
#tercer_parcial=float(input("Ingrese calificacion 3:"))
#promedio=(primer_parcial+segundo_parcial+tercer_parcial)/3
#print("El promedio del alumno es:",round(promedio,2))
#aprueba=promedio>=6
#print("El alumno aprueba:",aprueba)

#Como tener menos decimales. Sintaxis: round(variable,decimales)

#EJERCICIO 2

#radio=3
#pi=3.14
#area=pi*radio**2
#print("El area es:",area)

#EJERCICIO 3

#palabra1=input("Ingrese palabra uno:")
#palabra2=input("Ingrese palabra dos:")
#iguales=palabra1==palabra2
#print("Las palabras son iguales:",iguales)
#longitud=len(palabra1)==len(palabra2)
#print("Palabras son de la misma longitud:",longitud)

#startwith()--->para prefijo
#prefijo=palabra2.startswith(palabra1)
#print("Primera palabra es prefijo de la segunda:",prefijo)

#INTRO CADENA DE CARACTERES

#EJERCICIO 1

#Indexar--->encontrar la posicion de un caracter dentro de un str
#materia="programacion"
#print(materia[-5])

#Slicing--->permite extraer una seccion de un str
#Sintaxis: variable[inicio:fin:saltos]
#print(materia[2:8:3])

#EJERCICIO 2
#Funcion len()--->indica el numero de caracteres
#materia="fisica"
#print(len(materia))

#replace()--->reemplaza un caracter por otro
#materia="viva la huevada"
#Materia= materia.replace(" ","")
#print(len(Materia))

#EJERCICIO 3
#url=input("Ingrese la URL a analizar:")
#dominio=url[4:]
#print("El dominio es:",dominio)
#print("La URL pertence a:")
#ecuador=url[-2:]=="ec"
#colombia=url[-2:]=="co"
#chile=url[-2:]=="cl"
#mexicono=url[-2:]=="mx"
#print("Ecuador:",ecuador)
#print("Colombia:",colombia)
#print("Chile:",chile)
#print("Mexicono:",mexicono)

#index()--->posicion de un caracter en particular
#Por ejemplo en el url tengo www.david@espol.edu.ec, es decir depende de cuantas letras tenga el nombre del usuario
#url=input("Ingrese la URL a analizar:")
#inicio=url.index("e")
#dominio=url[inicio:]
#print("El dominio es:",dominio)
#print("La URL pertence a:")
#ecuador=url[-2:]=="ec"
#colombia=url[-2:]=="co"
#chile=url[-2:]=="cl"
#mexicono=url[-2:]=="mx"
#print("Ecuador:",ecuador)
#print("Colombia:",colombia)
#print("Chile:",chile)
#print("Mexicono:",mexicono)


#Funcion in--->devuelve T o F si algo se encuentra dentro de la cadena
#materia="programacion"
#validacion="progr" in materia
#print(validacion)

#Funcion not in---->devuelve T o F si algo no se encuentra dentro de la cadena
#raza_de_perro= "doberman"
#validacion2="aura"not in raza_de_perro
#print(validacion2)

#index---->devuelve la posicion de un caracter dentro de un str
#posicion=materia.index("o")
#print(posicion)

#find--->devuelve la posicion de un caracter dentro de un str
#apu=materia.find("o")
#print(apu)

#index=find--->solo cambia en el resultado, es decir cuando no se encuentra la letra que se busca: en find aparece -1 y en index "error"

#EJERCICIO 1
#correo=input("Ingrese correo electrónico:")
#dominio=correo.index("@")
#espol=correo[dominio:]
#print(espol)
#pertenencia=espol=="@espol.edu.ec"
#print("El correo pertenece a la ESPOL?",pertenencia)

#strip()---->eliminar caracteres a la izq y a la derecha de una cadena

fusilero="hola que tal"
aver=fusilero.strip("a")
print(aver)

#capitalize()--->convertir el primer caracter de la cadena en MAYUSCULA
#lower()---->convertir todos los caracteres de la cadena en MINUSCULA
#upper()--->convertir todos los caracteres de la cadena es MAYUSCULA
#swapcase()--->convertir todos los caracteres de minuscula a mayuscula y viceversa
#title()--->convertir una cadena en formato titulo
#count()--->sirve para contar cuantas veces se repite algo en una cadena
