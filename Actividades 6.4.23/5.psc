Algoritmo sin_titulo
	Definir n1,n2, contador, num Como Entero
	contador = 0
	Escribir "Ingrese minimo"
	leer n1
	Escribir "Ingrese maximo"
	Leer n2
	Escribir "Ingrese un numero"
	Leer num
	Mientras num >= n1 Y num <= n2
		Escribir "Dame otro numero"
		Leer num
		contador = contador + 1
	FinMientras
	Escribir "Ingreso un total de ", contador " numeros"
FinAlgoritmo
