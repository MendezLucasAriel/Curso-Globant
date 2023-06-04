//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
	//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
	//resultados.
Algoritmo sin_titulo
	Definir i, e Como real
	Escribir "Ingrese un numero"
	leer i
	i = abs(i)
	e = 0
	Escribir i
	hacer 
		i = trunc(i * 0.10)
		Escribir i
		e = e+1
		
	Mientras Que i <> 0
		Escribir "Cant dig ", e
FinAlgoritmo
