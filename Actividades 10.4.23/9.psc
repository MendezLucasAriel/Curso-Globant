Algoritmo sin_titulo
	Definir mes Como Caracter
	Definir compra Como Real
	Escribir "Ingrese el mes"
	Leer mes
	mes<-Minusculas(mes)
	Escribir "Ingrese el valor de la compra"
	Leer compra
	Si (mes == "septiembre" o mes== "octubre" o mes == "noviembre")
		compra = compra * 0.9
	FinSi
	Escribir "El costo final es de ", compra
FinAlgoritmo
