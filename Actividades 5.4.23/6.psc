Algoritmo sin_titulo
	Definir num, n1, n2 Como Caracter
	Escribir "Ingrese un numero de 3 cifras"
	Leer num
	n1<-SubCadena(num,0,0)
	n2<-SubCadena(num,2,2)
	Si (n1 == n2)
		Escribir "El numero es capicua"
	SiNo
		Escribir "No es capicua"
	FinSi
FinAlgoritmo
