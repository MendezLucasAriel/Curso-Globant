//Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
//componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
	//deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
//de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
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
