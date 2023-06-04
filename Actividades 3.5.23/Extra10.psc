Algoritmo sin_titulo
	Definir n, i, b Como Entero
	Definir a Como Caracter
	Definir prom Como Real
	prom = 0
	Escribir "Dame long vector"
	leer n
	Dimension a[n]
	Dimension b[n]
	Para i =0 hasta n-1 con paso 1 Hacer
		Escribir "Dame nombre"
		leer a[i]
		Escribir a[i]
		b[i] <- Longitud(a[i])
		
		
	FinPara
	
	Para i = 0 Hasta n-1 con paso 1 Hacer
		Escribir "Nombre ", a[i] " longitud de ", b[i]
		
	FinPara
	
FinAlgoritmo
