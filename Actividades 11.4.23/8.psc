Algoritmo sin_titulo
	Definir n1, n2, n3 Como Real
	Escribir "Ingrese dia"
	leer n1
	Escribir "Ingrese mes"
	Leer  n2
	Escribir "Ingrese año"
	Leer n3
	Si (n1 <= 31 Y n2 <=12)
		Escribir "Los valores son validos"
		Segun n2 Hacer
			
			1:
				Escribir ,n1 " de Enero de ",n3
				
			2:
				Escribir ,n1 " de Febrero de ",n3
				
			3:
				Escribir ,n1 " de Marzo de ",n3
			4:
				Escribir ,n1 " de Abril de ",n3
			5:
				Escribir ,n1 " de Mayo de ",n3
			6:
				Escribir ,n1 " de Junio de ",n3
			7:
				Escribir ,n1 " de Julio de",n3
			8:
				Escribir ,n1 " de Agosto de " ,n3
			9:
				Escribir ,n1 "de Septiembre de ",n3
			10:
				Escribir ,n1 " de Octubre de ",n3
			11:
				Escribir ,n1 " de Noviembre de ",n3
			12:
				Escribir ,n1 " de Diciembre de ",n3
				
				
			De Otro Modo:
				Escribir "mensaje de error"
				
				
		FinSegun
	SiNo 
		Escribir "Dia o mes en formato incorrecto"
	FinSi
FinAlgoritmo
