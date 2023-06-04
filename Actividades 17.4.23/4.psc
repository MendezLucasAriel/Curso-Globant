Algoritmo sin_titulo
	Definir mult, i, t, a Como Entero
	a=0
	Para i <- 1 Hasta 100	Hacer
		mult = i mod 2
		t = i mod 3
		Si mult == 0 o t == 0
			a = a+1
		FinSi
	FinPara
	Escribir "Hay un total de ", a " ente 1 y 100"

FinAlgoritmo
