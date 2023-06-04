Algoritmo sin_titulo
	Definir num, divisor, resto, a, i Como Real
	A = 1
	i=0
	Escribir "Ingrese el dividendo"
	leer num
	Escribir "Ingrese el divisor"
	Leer divisor
	Hacer
		restasucec(num, divisor, resto, a, i)
	Mientras Que A <> 0
	Escribir "Cociente ", i " resto ", num
FinAlgoritmo

SubAlgoritmo restasucec (num Por Referencia, divisor Por Valor, resto Por Referencia, A Por Referencia, i Por Referencia)
	Si num >= divisor
		num = num - divisor
		i = i+1
	SiNo
		Resto = num
		A = 0
	FinSi
	
FinSubAlgoritmo
