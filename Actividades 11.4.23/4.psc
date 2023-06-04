Algoritmo sin_titulo
	Definir result, n1, n2 Como Real
	Definir ashe Como Caracter
	Escribir "Ingrese la operacion a realizar"
	Leer ashe
	ashe <- Minusculas(ashe)
	Escribir "Ingrese un numero"
	Leer n1
	Escribir "Ingrese otro numero"
	Leer n2
	Segun ashe Hacer
		"s":
			result = n1+n2
		"r": 
			result = n1-n2
		"m":
			result = n1*n2
		"d":
			result = n1/n2
		De Otro Modo:
			Escribir "no ingresaste una operacion valida"
			
	FinSegun
	Escribir "El resultado de la operacion entre " ,n1 " y ",n2 " es ",result
FinAlgoritmo
