//Realizar una función que calcule y retorne la suma de todos los divisores del número n distintos de n. El valor de n debe ser ingresado por el usuario.

Algoritmo sin_titulo
	Definir n Como Entero
	Escribir "Deme un numero "
	leer n
	Escribir verificarNumero(n)
FinAlgoritmo


Funcion sumdiv <- verificarNumero(num)
	
	definir i, contador, sumdiv Como Entero
	sumdiv = 0
	//contador = 0
	
	Para i<-1 Hasta num Con Paso 1 Hacer
		
		Si num mod i == 0 Y num <> i Entonces
			sumdiv = sumdiv + i
		Fin Si
		
	Fin Para
	
FinFuncion