Algoritmo D19_E6
	Definir frase, letra, array Como Caracter
	Definir i, pos Como Entero
	Dimension array[20]
	
	Hacer
		Escribir "Ingrese una frase de máximo 20 caracteres."
		Leer frase
		
		Si longitud(frase)>20
			Escribir "Longitud de frase inválida.."
		FinSi
	Mientras Que longitud(frase)>20
	
	Para i= 0 Hasta 19 Hacer
		array[i] = Subcadena(frase, i, i)
		
		Si array[i]==""
			array[i] = " "
		FinSi
		Escribir Sin Saltar array[i]
	FinPara
	
	
	
	Escribir ""
	
	Escribir "Caracter:"
	Leer letra
	Escribir "Posicion:"
	Leer pos
	
	Si array[pos] == "" o array[pos] == " "
		array[pos] = letra
	SiNo
		Escribir "No se pudo ingresar el caracter."
	FinSi
	
	Para i= 0 Hasta 19 Hacer
		
		Escribir Sin Saltar array[i]
	FinPara
	
	
FinAlgoritmo