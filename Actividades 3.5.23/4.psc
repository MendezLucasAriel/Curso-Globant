Algoritmo sin_titulo
	Definir a, b, c, d, e, i, long Como Entero
	Definir sus, xd Como Caracter
	Definir salir, AA, BB,CC Como Logico
	Escribir "Deme la longitud del vector"
	leer long
	salir = Falso
	AA = Falso
	BB= Falso
	CC = Falso
	Dimension a[long]
	Dimension b[long]
	Dimension c[long]
	Dimension d[long]
	Dimension e[long]
	Hacer 
		Escribir "Elija que quiere hacer"
		Escribir "A) Llenar Vector A aleatoriamente"
		Escribir "B) Llenar Vector B aleatoriamente"
		Escribir "C) Sumar Vector A y B"
		Escribir "D) Restar vector A y B"
		Escribir "E) Elegir vector a mostrar"
		Escribir "F) Salir"
		leer sus	
		sus = Minusculas(sus)
		Segun sus
			"a":
				Para i=0 hasta long-1 con paso 1 Hacer
					a[i] = Aleatorio(-100,100)
				FinPara
				AA = Verdadero
			"b":
				Para i=0 hasta long-1 con paso 1 Hacer
					b[i] = Aleatorio(-100,100)
				FinPara
				BB = Verdadero
			"c":
				Si AA == Verdadero Y BB == Verdadero
					Para i=0 hasta long-1 con paso 1 Hacer
						C[i] = a[i]+b[i]
					FinPara
					CC = Verdadero
				Sino
					Escribir "Le falta llenar vector a o b"
				FinSi
			"d":
				Si AA == Verdadero Y BB == Verdadero
					Para i=0 hasta long-1 con paso 1 Hacer
						d[i] = b[i]-a[i]
					FinPara
				SiNo
					Escribir "le falta llenar vector a o b"
				FinSi
			"e":
				Escribir "Ingrese que vector quiere ver a, b o c"
				leer xd	
				xd = Minusculas(xd)
				
				Segun xd
					"a":
						Si AA == Verdadero
						Para i=0 hasta long-1 con paso 1 Hacer
							Escribir "Valor de vector A = ", a[i] " en la posicion ", i
						FinPara
					Sino 
						Escribir "Vector A no a sido llenado"
					FinSi
					
				"b":
					Si  BB == Verdadero
						Para i=0 hasta long-1 con paso 1 Hacer
							Escribir "Valor de vector B = ", b[i] " en la posicion ", i
						FinPara
					Sino 
						Escribir "Vector B no a sido llenado"
					finsi
					
				"c":
					Si CC == Verdadero 
						Para i=0 hasta long-1 con paso 1 Hacer
							Escribir "Valor de vector C = ", c[i] " en la posicion ", i
						FinPara
					Sino 
						Escribir "Vector C no a sido llenado"
					FinSi
					
				FinSegun
			
		"f": 
			salir = Verdadero
			FinSegun
	Mientras Que salir = Falso
FinAlgoritmo
