Algoritmo sin_titulo
	Definir parciales, parcial, final, trabajo Como Real
	Escribir "Ingrese el valor de la primera nota del parcial"
	Leer parcial
	parciales = parcial
	Escribir "Ingrese el valor de la segunda nota del parcial"
	Leer parcial
	parciales = parciales + parcial
	Escribir "Ingrese el valor de la tercera nota del parcial"
	Leer parcial
	parciales = parciales + parcial
	parciales = (parciales/3) * 0.55
	Escribir "Ingrese la nota del final"
	Leer final
	final = final * 0.3
	Escribir "Ingrese la nota del trabajo practico final"
	Leer trabajo
	trabajo = trabajo * 0.15
	parciales = parciales + trabajo + final
	Escribir "Su calificacion final es ", parciales
	
	
FinAlgoritmo
