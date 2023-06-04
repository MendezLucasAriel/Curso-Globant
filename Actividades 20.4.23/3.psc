Algoritmo numMultiplo
	Definir num1, num2 Como Entero
	Escribir "Ingrese el 1er numero"
	Leer num1
	Escribir "Ingrese el 2do numero"
	Leer num2
	Si Multiplo(num1,num2) == Verdadero
		Escribir "El " num1 " es multiplo de " num2 
	SiNo
	
			Escribir "El " num2 " es multiplo de " num1 
			
		FinSi

FinAlgoritmo


funcion esMultiplo = multiplo (num1, num2) 
	definir esMultiplo Como Logico
	si num1 MOD num2 == 0 Entonces
		esMultiplo = Verdadero 
	sino 
		esMultiplo= Falso
	FinSi
	
FinFuncion