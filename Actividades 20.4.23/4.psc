Algoritmo sin_titulo
	Definir frase,letra Como Caracter
	Definir z Como Entero
	Escribir "Por favor, escriba una frase"
	Leer frase
	Hacer 
		Escribir "¿Qué letra desea buscar?"
		Leer letra
		z=longitud(letra)
	Mientras Que z<>1 
	Escribir "La letra " letra " en la frase se encuentra: " buscarLetra(frase,letra) " veces."
	
FinAlgoritmo

Funcion d <- buscarLetra (frase,letra)
	Definir a,b,d Como Entero
	Definir c Como Caracter
	b= longitud(frase)
	d=0
	Para a=0 Hasta b Con Paso 1 Hacer
		c=subcadena(frase,a,a)
		Si c==letra Entonces
			d=d+1
		FinSi
	FinPara
FinFuncion
FinAlgoritmo
