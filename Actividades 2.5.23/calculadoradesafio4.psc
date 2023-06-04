Algoritmo calculadora
	menu()
FinAlgoritmo

SubProceso menu()
	Definir i como entero
	Definir largoColumna,largo, ancho, espesor,anchoPiso, largoPiso como Real
	Hacer
		Escribir "------ CALCULADORA DE MATERIALES PARA CONSTRUIR ------"
        Escribir "1. Calcular muro de ladrillo"
        Escribir "2. Calcular viga de hormigón"
        Escribir "3. Calcular columnas de hormigón"
        Escribir "4. Calcular contrapisos"
        Escribir "5. Calcular techo"
        Escribir "6. Calcular pisos"
        Escribir "7. Calcular pintura"
        Escribir "8. Calcular iluminación"
        Escribir "9. Salir"
        Escribir "Ingrese una opción:"
		Leer i
		Segun i Hacer
			1:
				calcularMuro()
			2:
				calcularViga()
			3:
				Escribir 'Escribir largo de la columna'
				Leer largoColumna
				calcularColumna(largoColumna)
			4:
				
				calcularContrapiso()
			5:
				Escribir "Ingrese largo "
				leer largo
				Escribir "ancho"
				leer ancho
				Escribir "espesor"
				leer espesor
				calcularTecho(largo, ancho, espesor)
			6:
				Escribir 'Ingrese ancho'
				Leer anchoPiso
				Escribir 'Ingrese largo'
				Leer largoPiso
				calcularPisos(anchoPiso, largoPiso)
			7:
				calcularPintura()
			8:
				calcularIluminacion()
			9:
				Escribir "Saliendo de la calculadora"
			De Otro Modo:
				Escribir 'Ingrese un número correcto'
		Fin Segun
	Mientras que i <> 9
FinSubProceso

// 1
//Funciones para calcular Superficie y Volumen
//El usuario no puede acceder directamente a ellos
Funcion retornoSup = calcularSup(largo, alto)
	Definir retornoSup Como Real
	retornoSup = largo * alto	
Fin Funcion

Funcion retornoVol = calcularVol(largo, ancho, espesor)
	Definir retornoVol Como Real
	retornoVol = largo * ancho * espesor
Fin Funcion
//-------------------------------------------------------------
//Función para el calculo del muro de ladrillo
Funcion calcularMuro()
	Definir espesorMuro, largoMuro, altoMuro, supMuro, aux Como Real
	aux = 0
	Hacer
		Escribir "Ingrese el espesor del muro (20cm o 30cm solamente):"
		Leer espesorMuro
		si espesorMuro == 20 o espesorMuro == 30
			aux = 1
		FinSi
	Mientras Que aux <>1
	Escribir "Ingrese la Longitud del muro: "
	Leer largoMuro
	Escribir "Ingrese la altura del muro: "
	Leer altoMuro
	
	supMuro = calcularSup(largoMuro, altoMuro)
	
	Escribir "Se necesita: "
	Segun espesorMuro
		20:
			Escribir "Cemento: ", supMuro * 10.9, " kg."
			Escribir "Arena: ", supMuro * 0.09, " m3."
			Escribir "Ladrillos: " supMuro * 90
		30:
			Escribir "Cemento: ", supMuro * 15.2," kg."
			Escribir "Arena: ", supMuro * 0.115, " m3."
			Escribir "Ladrillos: " supMuro * 120
		De Otro Modo:
			Escribir "Espesor Incorrecto"
	FinSegun
	
	Esperar Tecla
	Limpiar Pantalla
	
FinFuncion

// 2
SubProceso calcularViga()
	Definir largo, kgCemento, m3arena, m2piedra, mHierro4, mHierro8 Como Real
	Escribir 'Ingrese el largo de la viga en metros'
	Leer largo
	
	kgCemento = largo * 9
	m3arena = largo * 0.02
	m2piedra = largo * 0.02
	mHierro4 = largo * 4
	mHierro8 = largo * 3
	
	Escribir 'Se necesitan los siguientes materiales para una viga de: ', largo
	Escribir '- ', kgCemento, ' kg de cemento'
	Escribir '- ', m3arena, ' m3 de arena'
	Escribir '- ', m2piedra, ' m2 de piedra'
	Escribir '- ', mHierro4, ' metros de hierro del 8'
	Escribir '- ', mHierro8, ' metros de hierro del 4'
FinSubProceso

// 3
SubProceso calcularColumna(largo por valor)
	Definir  cemt, arena, piedra, hierro8, hierro4 Como Real
	cemt = largo * 7.5
	arena = largo * 0.02
	piedra = largo *0.02
	hierro8= largo *4
	hierro4 = largo *3
	Escribir "La construccion necesitara: ", cemt " kg de cemento"
	Escribir "La construccion necesitara: ", arena " metros cubicos de arena"
	Escribir "La construccion necesitara: ", piedra " metros cuadrados de arena"
	Escribir "La construccion necesitara: ", hierro8 " metros de hierro de 8 pulgadas"
	Escribir "La construccion necesitara: ", hierro4 " metros de hierro de 4 pulgadas"
	
	
	
	// Esta X es para salir del while
	
FinSubProceso

// 4
SubProceso calcularContrapiso()
    Definir espesor, ancho, largo, volumen, cemento, arena, piedra Como Real
    Escribir "Ingrese el espesor del contrapiso en metros:"
    Leer espesor
    Escribir "Ingrese el ancho del contrapiso en metros:"
    Leer ancho
    Escribir "Ingrese el largo del contrapiso en metros:"
    Leer largo
    volumen <- espesor * ancho * largo
    cemento <- volumen * 105
    arena <- volumen * 0.45
    piedra <- volumen * 0.9
    Escribir "Para un contrapiso de", espesor, "m de espesor,", ancho, "m de ancho y", largo, "m de largo se necesitan:"
    Escribir cemento, "kg de cemento"
    Escribir arena, "m3 de arena"
    Escribir piedra, "m3 de piedra"
FinSubProceso


// 5
SubProceso calcularTecho(espesor, ancho, largo)
	Definir metcubic, cemt, arena, piedra, hierro8, hierro6  Como Real
	metcubic = calcularVol(largo, ancho, espesor)
	cemt = metcubic * 33
	arena = metcubic * 0.072
	piedra = metcubic *0.072
	hierro8= metcubic *7
	hierro6 = metcubic *4
	Escribir "La construccion necesitara: ", cemt " kg de cemento"
	Escribir "La construccion necesitara: ", arena " metros cubicos de arena"
	Escribir "La construccion necesitara: ", piedra " metros cuadrados de arena"
	Escribir "La construccion necesitara: ", hierro8 " metros de hierro de 8 pulgadas"
	Escribir "La construccion necesitara: ", hierro6 " metros de hierro de 6 pulgadas"
	
FinSubProceso

// 6
SubProceso calcularPisos(ancho por referencia , largo Por Referencia)
	Definir superficiePiso, superficieTotal como real
	superficiePiso = ancho * largo
    superficieTotal = superficiePiso * 1.1
    Escribir"La superficie total del piso es de ", superficieTotal, " m2"
	
FinSubProceso

// 7
SubProceso calcularPintura()
	Definir superficie Como Entero
	Definir pinturaCant Como Real
	Escribir 'Ingrese la superficie del muro'
	Leer superficie
	
	si superficie <= 0
		Escribir 'Ingrese una superficie válida'
	sino
		pinturaCant = superficie/6
		Escribir 'Necesita: ' pinturaCant ' litros de pintura para ' superficie 'm2 de superficie' 
	FinSi
FinSubProceso


// 8
subproceso calcularIluminacion()
	Definir espesor Como Entero
	Definir largo, alto, retornoSup, supIluminada Como Real
	
	Hacer
		Escribir "Ingrese el espesor deseado en cm. Las opciones son 20 o 30cm."
		Leer espesor
	Mientras Que espesor <> 30 y espesor <> 20
	
	Escribir "Ingrese el largo del muro:"
	Leer largo
	Escribir "Ingrese el alto del muro:"
	leer alto
	
	retornoSup = calcularSup(largo, alto)
	
	supIluminada= retornoSup*0.20
	Escribir "La cantidad mínima de superficie es de " supIluminada
	
Fin subproceso
