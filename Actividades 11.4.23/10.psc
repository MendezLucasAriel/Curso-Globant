Algoritmo sin_titulo
	Definir area, salario, comision, hora, valorh, horaext  Como Real
	Escribir "Ingrese la modalidad de trabajo (1 comision, 2 salario+comision, 3 salario)"
	Leer area
	Segun area Hacer
		1:
			Escribir "Ingrese monto total de las ventas"
			Leer comision
			salario = comision * 0.4
		2:
			Escribir "Ingrese monto total de ventas"
			Leer comision
			Escribir "Ingrese valor por hora"
			Leer valorh
			Escribir "Ingrese horas semanales"
			Leer hora
			Si (hora > 40)
				hora = 40
			FinSi
			salario = (comision * 0.25) + (hora * valorh)
			
		3:
			Escribir "Ingrese valor por hora"
			Leer valorh
			Escribir "Ingrese horas semanales"
			Leer hora
			Si (hora > 40)
				horaext = hora - 40
				hora = 40
			FinSi
			salario = (hora*valorh) + (horaext * (valorh*0.5))
		De Otro Modo:
			Escribir "Ingreso mal el tipo de salario"

	FinSegun
	Escribir "El salario final es de " salario
FinAlgoritmo
