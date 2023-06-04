Algoritmo sin_titulo
	Definir i, j, d, factorial Como Entero
	factorial = 1
	Para i = 1 Hasta 7 Hacer
		Escribir Sin Saltar "!", i, " = "
		Para j = 1 Hasta i Hacer
			factorial = factorial * j
			Si j = i Entonces
				Escribir j, " = ", factorial
			Sino
				Escribir Sin Saltar j, "*"
			FinSi
		FinPara
		factorial = 1
	FinPara
FinAlgoritmo