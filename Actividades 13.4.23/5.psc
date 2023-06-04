Algoritmo sin_titulo
	Definir cont, contpar, contimpar, sus  Como Entero
	Definir n1, mediapar, mediainpar Como Real
	cont = 0 
	contpar = 0
	contimpar = 0
	mediapar = 0
	mediainpar = 0
	Hacer
		Escribir "Ingrese un numero"
		leer n1
		cont = cont+1
		sus = n1 mod 2
		Si sus = 0
			contpar = contpar+1
			mediapar = mediapar + n1
		SiNo
			contimpar = contimpar+1
			mediainpar = mediainpar + n1
		FinSi
		
	Mientras Que cont < 10
	mediainpar = mediainpar  / contimpar
	mediapar = mediapar / contpar
	
	Escribir "El promedio de todos los pares es ", mediapar " y el de los impares es ",mediainpar
FinAlgoritmo
