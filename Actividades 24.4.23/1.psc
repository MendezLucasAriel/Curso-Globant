Algoritmo sin_titulo
	Definir A, B Como Entero
	Escribir "Dame numero mamaguevo"
	Leer A
	Escribir "Dame numero 2 mamaguevo"
	Leer B
	cambio(A,B)
	Escribir A "    ", B
FinAlgoritmo

SubProceso cambio (A1 Por Referencia, B1 Por Referencia)
	Definir z Como Entero
	Z = A1
	A1=B1
	Escribir A1
	B1 = Z
	Escribir B1
FinSubProceso
	