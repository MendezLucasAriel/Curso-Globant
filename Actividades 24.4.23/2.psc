Algoritmo sin_titulo
	Definir i, n Como Entero
	Escribir "Ingrese la cantidad de dias"
	Leer n
	Para i = 1 hasta n con paso 1
		promdia(i)
	FinPara
	
FinAlgoritmo

SubProceso promdia (i Por Referencia)
	Definir max, min, prom Como Real
	Escribir "Decime la maxima"
	Leer max
	Escribir "Decime la minima"
	Leer min
	prom = (max+min) / 2
	
	Escribir "La temperatura promedio del dia ", i " es de ", prom
FinSubProceso
	