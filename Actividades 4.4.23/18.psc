Algoritmo sin_titulo
	Definir n1, n2, n3 Como Real
	Escribir "Ingrese el primer numero"
	Leer n1
	Escribir "Ingrese el segundo numero"
	Leer n2
	Si (n1 < n2) Entonces
		n3 = n1
		n1 = n2
		n2 = n3
	FinSi
	n3 = n1 - n2 
	Escribir "La distancia absoluta es de ", n3 " unidades"
FinAlgoritmo
