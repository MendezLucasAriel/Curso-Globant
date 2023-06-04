Algoritmo sin_titulo
	Definir letra Como Caracter
	Escribir "Ingrese una letra"
	Leer letra
	letra<-SubCadena(letra,0,0)
	letra<-Minusculas(letra)
	Si 	(letra == "a" O letra == "e" O letra == "i" O letra == "o" O letra == "u" ) Entonces
		Escribir "Es vocal"
	SiNo
		Escribir "Es consonante"
	FinSi

	
FinAlgoritmo
