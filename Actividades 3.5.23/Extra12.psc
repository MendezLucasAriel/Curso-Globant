Algoritmo sin_titulo
	Definir a, i, z, chico, resta Como Entero
	Escribir "Dame long del vector"
	leer z
	Dimension a[z]
	Para i =0 hasta z-1 Con Paso 1 Hacer
		Escribir "Ingresa valor"
		leer a[i]
		
	FinPara
	
	resta = masgrande(a,z)
	resta = resta- maschico(a,z)
	Escribir  "La diferencia entre el mas grande y el mas chico es de ", resta
	
FinAlgoritmo
Funcion chico <- maschico(a Por referencia, z Por referencia	)
	Definir chico, i Como Entero
	Para i=0 hasta z-1 con paso 1 Hacer
		si i==0
			chico=a[i]
		SiNo
			Si chico > a[i]
				chico = a[i]
			FinSi
		FinSi
		//Escribir "Maschico", chico

	FinPara
FinFuncion

Funcion grande <- masgrande(a Por referencia, z Por Referencia)
	Definir grande, i Como Entero
	Para i=0 hasta z-1 con paso 1 Hacer
		si i==0
			grande=a[i]
		SiNo
			Si grande < a[i]
				grande = a[i]
				
			FinSi
		FinSi
		//Escribir "Masgrande", grande
	FinPara
FinFuncion
