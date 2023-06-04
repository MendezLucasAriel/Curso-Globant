Algoritmo sin_titulo
	Definir palabra Como Caracter
	Definir a Como Entero
	Escribir "Ingrese una palabra o frase"
	Leer palabra
	a <-Longitud(palabra)
	Si (a == 4)
		palabra <-Concatenar(palabra,"!")
		Escribir palabra
	SiNo
		palabra <-Concatenar(palabra,"?")
		Escribir palabra
	FinSi
FinAlgoritmo
