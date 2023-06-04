Algoritmo sin_titulo
	Definir n, prom, mayor, promf, procalumn Como Real
	Definir i, alum, parc, desap, totalalumn, turkish Como Entero
	desap = 0
	totalalumn = 0
	mayor = 0
	turkish = 0
	promf = 0
	Escribir "	Digame cuantos alumnos tiene"
	Leer alum
	para i <- 1 Hasta alum Hacer
		Escribir "Ingrese nota de TP integrador"
		Leer n
		prom = n* 0.35
		Escribir "Ingrese nota de expo"
		Leer n
		prom = n* 0.25 + prom
		Escribir "Ingrese nota de parcial"
		Leer n
		Si n >= 4 Y n <= 7.5 
			turkish = turkish + 1
			
		FinSi
		prom = n* 0.40 + prom
		Si prom < 6.5 
			promf = prom
			desap = desap + 1
		SiNo
			Si prom > 7.5 
				totalalumn = totalalumn+1
			FinSi
			
		FinSi
		Si n > mayor
			mayor = n
		FinSi
		
	FinPara
	promf = promf / desap
	procalumn =  (totalalumn * 100 ) / (i-1)
	Escribir "Valor de I", i
	Escribir  "Un total de ", turkish " obvtuvieron entre un 4 y un 7,5 en el parcial, la mayor nota es ", mayor " el promedio de los que desaprobaron es ", promf " y el porcentaje de alumnos que se sacaron mas de 7,5 en el parcial es de ", procalumn "%"
FinAlgoritmo
