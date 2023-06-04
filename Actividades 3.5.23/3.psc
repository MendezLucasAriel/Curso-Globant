Algoritmo sin_titulo
	Definir i, value, valorbuscar Como Entero
	Definir posicion Como Caracter
	Dimension value[5]
	posicion="Valor/es: "
	Para i=0 hasta 4 con paso 1 Hacer
		Escribir "Dame un numero"
		leer value[i]
	FinPara
	Escribir "Elija un parametro para buscar"
	leer valorbuscar
	Para i=0 hasta 4 con paso 1 Hacer
		Si valorbuscar==value[i] Y i==0
			posicion = Concatenar(posicion,ConvertirATexto(i))
		SiNo
			Si valorbuscar==value[i] Entonces
				posicion = Concatenar(posicion," y ")
				posicion = Concatenar(posicion,ConvertirATexto(i))
			FinSi
		FinSi
	FinPara
	Si posicion <> "Valor/es: " Entonces
		Escribir "Se encontro el valor ", valorbuscar " en las posiciones ", posicion
	SiNo
		Escribir "No se encontro el valor ", valorbuscar " en ninguna posicion" 
	FinSi
FinAlgoritmo
