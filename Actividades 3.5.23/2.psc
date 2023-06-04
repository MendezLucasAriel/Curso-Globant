Algoritmo sin_titulo
	Definir n, i, suma, resta, multiplicacion, division Como Real
	Dimension n[10]
	Para i = 0 hasta 9 con paso 1 Hacer
		Escribir "Dame un numero"
		leer n[i]
		SI i == 0
			suma = n[i]
			resta = -n[i]
			multiplicacion = n[i]
			division = n[i]
		SiNo
			suma = suma+n[i]
			resta = resta-n[i]
			multiplicacion = multiplicacion*n[i]
			division = division/n[i]
		FinSi
	FinPara
	Escribir "suma ",suma
	Escribir "resta ",resta
	Escribir "multiplicacion ",multiplicacion
	Escribir "division", division
FinAlgoritmo
