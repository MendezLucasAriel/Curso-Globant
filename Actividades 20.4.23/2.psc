//Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener
//mensajes que digan si es par o no, eso debe pasar en el Algoritmo.

Algoritmo esImpa
	Definir  num  Como Entero
	
	Escribir "Ingrese el n�mero"
	Leer  num
	Escribir "Es impar? " Impar(num)
	
FinAlgoritmo

Funcion esimPar <- Impar(num Por Referencia)
	Definir  esimPar Como Logico
	Si (num MOD 2 ==0) Entonces
		esimPar= Falso
	SiNo
		esimPar = Verdadero
	FinSi
FinFuncion