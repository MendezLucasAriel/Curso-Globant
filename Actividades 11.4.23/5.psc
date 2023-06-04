Algoritmo sin_titulo
	Definir n1, fina como Entero
	Escribir "Ingrese numero"
	Leer n1
	fina = n1 mod 2
	Si (n1 == 0)
		Escribir "El numero no es par ni impar"
	SiNo
		Si ( fina == 0)
			Escribir "El numero es par"
		SiNo
			Escribir "El numero es impar"
		FinSi
	FinSi
FinAlgoritmo
