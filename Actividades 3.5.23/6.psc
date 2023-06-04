Algoritmo sin_titulo
	Definir palabra, vector, value Como Caracter
	Definir a, i, h Como Entero
	Escribir "Dame la palabra"
	leer palabra
	a = Longitud(palabra)
	
	Dimension vector[a]
	Para i = 0 Hasta a-1 con paso 1 hacer
		vector[i] = Subcadena(palabra,i,i)
	FinPara
	
	para i=0 hasta a-1 con paso 1 Hacer
		Escribir "Valor de vector ", vector[i] " en posicion", i
	FinPara

		
	Escribir "Dame valor " 
	leer value
	Hacer
	Escribir "Dame posicion en la que reemplazar por ese valor"
	leer h
	si h > a Entonces
		Escribir "La posicion que me diste es mas grande que la cantidad de posiciones en el array"
	FinSi
	Mientras Que h > a

	si vector[h] == "" o vector[h] == " "
		vector[h] = value
		
	FinSi
	para i=0 hasta a-1 con paso 1 Hacer
		
		Escribir "Valor de vector ", vector[i] " en posicion", i
	FinPara

FinAlgoritmo
