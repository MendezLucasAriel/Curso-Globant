Algoritmo sin_titulo
	Definir palabra, verifpunt Como Caracter
	Definir a Como Entero

	Hacer
		Escribir "Dame una palabra terminada en ."
		leer palabra
		a <- Longitud(palabra)
		a = a-1
		verifpunt <- SubCadena(palabra,a,a)
		palabra <- Minusculas(palabra)
	Mientras Que verifpunt <> "."
	Escribir palabra
	Escribir a
	amogus(palabra, a)
	Escribir palabra
FinAlgoritmo

Subproceso amogus (palabra Por Referencia, a Por Valor)
	Definir i Como Entero
	Definir  amo, gus Como Caracter
	amo = ""
	Para i = 0 Hasta a Con Paso 1 Hacer
		gus <- Subcadena(palabra, i,i)
		Segun gus
			"a": 
				amo = Concatenar(amo,"@")
			"e":
				amo = Concatenar(amo,"#")
			"i": 
				amo = Concatenar(amo,"$")
			"o":
				amo = Concatenar(amo,"%")
			"u": 
				amo = Concatenar(amo,"*")
			De Otro Modo:
				amo = Concatenar(amo,gus)

		FinSegun
	FinPara
	palabra = amo

FinSubProceso
