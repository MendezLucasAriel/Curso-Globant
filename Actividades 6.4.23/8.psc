Algoritmo sin_titulo
	Definir num, cont Como Entero
	cont = 0
	Escribir "Ingrese un numero"
	leer num
	Mientras num  > 0
		cont = cont+1
		num = trunc(num / 10)
		
	FinMientras
	Escribir "Tiene un total de ", cont " digitos"
	
FinAlgoritmo
