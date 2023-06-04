Algoritmo sin_titulo
	Definir grado, defecto, sindefecto Como Entero
	Escribir "Ingrese la cantidad de tornillos defectuosos producidos"
	Leer defecto
	Escribir "Ingrese la cantidad de tornillos sin defectos producidos"
	Leer sindefecto
	Si (defecto > 200 Y sindefecto < 10000)
		Escribir "Grado 5"
		SiNo
			Si (defecto < 200 Y sindefecto < 10000)
				Escribir  "Grado 6"
			Sino 
				Si (defecto < 200 Y sindefecto >= 10000)
					Escribir "Grado 8"
					
				FinSi
				
			FinSi
			Si ( defecto > 200 Y sindefecto > 10000)
				Escribir "Grado 7"
			FinSi
	FinSi
FinAlgoritmo
