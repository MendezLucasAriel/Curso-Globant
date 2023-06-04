Algoritmo sin_titulo
	Definir clave, ntento Como Caracter
	Definir cont Como Real
	clave = "eureka"
	cont = 0
	
	Hacer
		Escribir "Ingrese una clave"
		leer ntento
		si ntento <> clave
			cont = cont +1
		FinSi
		
	Mientras Que ntento <> clave y cont < 3
	
	Si cont < 3
		Escribir "Pusiste bien la clave"
	SiNo
		Escribir "Mal"
	FinSi
	
FinAlgoritmo
