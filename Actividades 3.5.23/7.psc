Algoritmo sin_titulo
	Definir a, b,i Como Entero
	Definir iguales Como Logico
	iguales=Falso
	Dimension a[5]
	Dimension b[5]
	para i=0 hasta 4 con paso 1 Hacer
		a[i] = Aleatorio(-999999999,999999999) 
		b[i] = Aleatorio(-999999999,999999999) 
		Escribir a[i], b[i]
	FinPara
	
	Para i=0 Hasta 4 con paso 1 Hacer
		Si a[i] == b[i] Entonces
			iguales= Verdadero
		sino 
			iguales = Falso
		FinSi
		
	FinPara
	Escribir "A y B son identicos/iguales?", iguales
FinAlgoritmo
