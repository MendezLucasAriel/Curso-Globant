//Realizar una función que valide si un número es impar o no. Si es impar la función debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener
//mensajes que digan si es par o no, eso debe pasar en el Algoritmo.

Algoritmo esImpa
	Definir  num  Como Entero
	
	Escribir "Ingrese el número"
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