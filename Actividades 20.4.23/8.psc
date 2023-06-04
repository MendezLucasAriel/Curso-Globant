Algoritmo sin_titulo
	Definir user, pass Como Caracter
	Definir gus Como Entero
	gus = 0
	Hacer
		Escribir "Ingrese nombre"
		leer user
		Escribir "Ingrese contra"
		leer pass 
		
	Mientras Que gus <> 3 Y login(user, pass, gus) == Falso 
	
	Si login(user, pass, gus) = Falso
		Escribir "Reinicie el programa muchos intentos fallidos"
	SiNo
		Escribir "Usted a ingresado correctamente"
	FinSi
FinAlgoritmo

Funcion xd <- login(usern, passw, gus Por Referencia)
	Definir xd Como Logico
	
	Si usern <> "usuario1" o passw <> "asdasd" 
		xd = Falso
		gus = gus+1
	Sino 
		xd = Verdadero
	FinSi
FinFuncion
	