Algoritmo seventichinkue
	Definir palabra, a, e Como Caracter
	Definir ent Como Entero
	Escribir "Ingrese una palabra o frase"
	Leer palabra
	ent <-Longitud(palabra)
	ent = ent -1 
	Escribir ent
	a <-SubCadena(palabra,0,0)
	a<-Minusculas(a)
	e <-SubCadena(palabra,ent,ent)
	e <-Minusculas(e)
	Si (a == e )
		Escribir "Correcto" 
	SiNo
		Escribir "Incorrecto"
	FinSi
FinAlgoritmo
