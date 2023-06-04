Algoritmo sin_titulo
	Definir var1,centena, decena, unidad Como Entero
	Escribir "Ingrese 1 variable de numero entero"
	Leer var1
	
	unidad = var1 % 10
	
	decena = trunc((var1 MOD  100 - unidad) / 10)
	
	centena = trunc((var1 MOD  1000 - unidad) / 100)


	Escribir "unidad pa ", unidad
	Escribir "decena pa ", decena
	Escribir "centena pa ", centena


FinAlgoritmo
