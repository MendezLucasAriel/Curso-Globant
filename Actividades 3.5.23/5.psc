Algoritmo sin_titulo
	Definir num, i Como Entero
	dimension num[4]
	Para i=0 hasta 3 con paso 1 Hacer
		Escribir "Ingrese numero"
		leer num[i]
		
	FinPara
	Escribir "El mayor es ", buscarmayor(num)
FinAlgoritmo

Funcion mayor <- buscarmayor(N)
	Definir i, mayor Como entero
	Para i=0 hasta 3 con paso 1 hacer
		Si i==0 Entonces
			mayor = N[i] 
		SiNo
			si mayor < N[i] Entonces
				mayor = N[i]
			FinSi
		FinSi
	FinPara
FinFuncion
	