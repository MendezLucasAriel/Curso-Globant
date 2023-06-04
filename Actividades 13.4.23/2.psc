Algoritmo sin_titulo
	Definir max, min, prom, cont, num Como Real
	cont = 0
	prom = 0
	Hacer
		Escribir "Ingrese un numero"
		Leer num
		Si num <> 0 

		Si cont == 0
			cont = cont+1
			max = num
			min = num
		FinSi
		
		Si num > max
			max = num
			SiNo
				Si num < min
					min = num
				FinSi
			FinSi
			prom = num + prom
			cont = cont+1
		
		

		FinSi
	Mientras Que num <> 0
	cont = cont -1
	Escribir prom
	prom = prom / cont
	Escribir "Numeron minimo ", min " numero maximo ", max " promedio ", prom " con un total de ", cont " numeros" 
FinAlgoritmo
