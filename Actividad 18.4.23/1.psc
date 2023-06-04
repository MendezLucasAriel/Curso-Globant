Algoritmo sin_titulo
	Definir vend,sueldo, comision, venta Como Real
	Definir i, n, j, k Como Entero
	Escribir "Ingrese la cantidad de vendedores"
	leer n
	para i <- 1 hasta n	con paso 1 Hacer
		comision = 0
		Escribir "Ingrese el sueldo del vendedor"
		leer sueldo
		Escribir "Ingrese cuantas ventas realizo"
		leer k
		Para j <-1 hasta k con paso 1 Hacer
			Escribir "Ingresar valor de venta de la venta N", j
			Leer venta
			comision = comision + venta * 0.10
		FinPara
		sueldo = sueldo + comision
		Escribir "El valor percibido por comisiones es de ", comision " y el valor total del sueldo es de ", sueldo
	FinPara
FinAlgoritmo
