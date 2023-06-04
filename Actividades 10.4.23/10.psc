Algoritmo sin_titulo
	Definir n1, n2, resto, resto2 Como Real
	Escribir "Ingrese el valor del primer numero"
	Leer n1
	Escribir "Ingrese el valor del segundo numero"
	Leer n2
	resto = n1 mod 2
	resto2 = n2 mod 2
	Si (resto == 0 y resto2 == 0)
		Escribir "Ambos son pares"
	SiNo
		Escribir "Ambos son impar o al menos uno de ellos lo es"
	FinSi
FinAlgoritmo
