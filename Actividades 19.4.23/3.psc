Algoritmo sin_titulo
	Definir user, contra Como caracter
	Definir login como logico
	Definir a, tuki, plata, grbot, n, i,trade, saldo Como Entero
	login = Falso
	saldo = 0
	plata = 0
	a = 0
	Escribir "Ingrese user"
	leer user
	Escribir "Ingrese contra"
	leer contra
	si user == "Albus_D"
		Hacer
			
		Si contra == "caramelosdelimon"
			login = Verdadero
		SiNo
			a = a+1
		FinSi
		Mientras Que login <> Verdadero y a < 3
	SiNo
		Escribir "kys"
	FinSi
	si a <> 3 y login == Verdadero
		
	Hacer
	Escribir "Ingresar botella (ingrese 1)"
	Escribir "Ver saldo (ingrese 2)"
	Escribir "Salir (ingrese 3)"
	Leer tuki
	
		
	Segun tuki hacer
		1: 
			Escribir "Cuantas botellas va a ingresar"
			leer n
			Para i=1 hasta n Con Paso 1 Hacer
				grbot = Aleatorio(100, 3000)
				Escribir grbot, "gramos"
				Si grbot < 500
					plata = plata+50
					
				SiNo
					Si grbot >= 500 y grbot <= 1500
						plata = plata+125
					SiNo
						plata = plata + 200
					FinSi
				
					
				FinSi
			FinPara
			Escribir "Te ofrecemos ", plata "$ la queres? 1 para si y 2 para no" 
			Leer trade
			Si trade = 1
				saldo = saldo + plata
				plata = 0
			SiNo
				Escribir "Devolviendo botellas"
				plata = 0
			FinSi
			
		2:
			Escribir "Saldo:", saldo
		3:
			Escribir "Salir del sistema"
		De Otro Modo:
			Escribir "Ingresa un valor valido "
			
	FinSegun
	Mientras Que tuki <> 3 

SiNo
	Escribir "Inteaste pa"
FinSi
FinAlgoritmo
