Algoritmo sin_titulo
	Definir num, n2, suma Como Real
	Definir n, n1 Como Caracter
	n1= "n"
	Hacer 
		Escribir "Ingrese un numero"
		Leer num
		Escribir "Desea ingresar otro numero?"
		Leer n
		n <-Minusculas(n)
		
	Mientras Que n <> n1
	Escribir "Ingrese otro numero mas"
	Leer n2
	suma = num + n2
	Escribir "Resultado " suma
FinAlgoritmo
