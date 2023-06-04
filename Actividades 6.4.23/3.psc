Algoritmo sin_titulo
	Definir value, promedio, contador Como Real
	contador = 0
	Escribir "Ingrese un valor"
	Leer value
	promedio = value
	contador = 1
	Mientras value <> -1
		Escribir "Ingrese otro valor, si desea dejar de ingresar valores ingrese -1 "
		Leer value
		promedio = value + promedio
		contador = contador + 1
	FinMientras
	promedio = promedio / contador
	Escribir "El promedio final es ", promedio " ingreso un total de ", contador " notas"
FinAlgoritmo
