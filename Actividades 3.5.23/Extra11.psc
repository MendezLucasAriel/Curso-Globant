Algoritmo sin_titulo
	Definir notas, def, reg, bu, ex,i Como Entero
	def=0
	reg=0
	bu=0
	ex=0
	
	Dimension notas[100]
	Para i=0 hasta 99 con paso 1 Hacer
		notas[i] = Aleatorio(0,20)
		Si notas[i] <6 Entonces
			def=def+1
		Sino 
			si notas[i] < 11
				reg = reg+1
			SiNo
				Si notas[i] <16
					bu = bu+1
				SiNo
					ex=ex+1
				FinSi
			FinSi
		FinSi
	FinPara
	Escribir "Hay un total de ", def " deficientes"
	Escribir "Hay un total de ", reg " regulares"
	Escribir "Hay un total de ", bu " buenos"
	Escribir "Hay un total de ", ex " excelentes"
FinAlgoritmo
