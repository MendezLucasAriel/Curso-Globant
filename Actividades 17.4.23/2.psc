Algoritmo sin_titulo
	Definir	word, eee Como caracter
	Definir i, aaa Como Entero
	Escribir "Ingrese su palabra"
	Leer word
	aaa<- Longitud(word)
	aaa = aaa - 1
	Para i <- 0 Hasta aaa Con Paso 1 Hacer
		eee<-SubCadena(word,i,i)
		Escribir Sin Saltar  eee " "

	FinPara
	
FinAlgoritmo
