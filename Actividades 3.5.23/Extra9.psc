Algoritmo sin_titulo
	Definir n, ing,i Como Entero
	Definir prom Como Real
	prom = 0
	Escribir "Dame long vector"
	leer n
	Dimension ing[n]
	Para i =0 hasta n-1 con paso 1 Hacer
		Escribir "Dame valor"
		leer ing[i]
		prom = ing[i]+prom
	FinPara
	Escribir "El promedio es ", prom/n
FinAlgoritmo
