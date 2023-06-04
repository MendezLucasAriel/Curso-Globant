Algoritmo sin_titulo
	Definir azares, numuser  Como Entero
	azares = azar(10)
	Hacer
		
		Escribir "Dame un valor"
		leer numuser
		//Escribir azares
		Si numuser < azares
			Escribir "Muy chico"
		SiNo
			Si numuser> azares
				Escribir "Muy grande"
			Finsi	
		FinSi
	Mientras Que numuser <> azares
	Escribir "Bien ahi"
FinAlgoritmo
