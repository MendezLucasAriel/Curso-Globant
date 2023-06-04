Algoritmo sin_titulo
	Definir 	comisiones, sueldo, comision Como Real
	Escribir "Ingrese sueldo base"
	Leer sueldo
	Escribir "Ingrese la primera venta"
	Leer comision
	comisiones= comision
	Escribir "Ingrese la segunda venta"
	Leer comision
	comisiones = comisiones + comision
	Escribir "Ingrese tercera venta"
	Leer comision
	comisiones = comisiones + comision
	comisiones = comisiones * 0.10
	sueldo = comisiones + sueldo
	Escribir "Sueldo final de ", sueldo " con un valor percibido de comisiones de ", comisiones
FinAlgoritmo
