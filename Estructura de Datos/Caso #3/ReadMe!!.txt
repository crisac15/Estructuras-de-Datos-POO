Se adjuntan 3 carpetas con cada una de las partes a evaluar.

La carpeta Infija to Post fija contiene un archivo ToPostFijo.cpp donde se programan las funciones necesarias para llevar a cabo la transformacion de infijo a postfijo y su posterior evaluacion, en el main de este ToPostFijo.cpp solo se llaman a las funciones, atendiendo a los principios de encapsulamienton que se buscaba desarrollar. La primera funcion solicita y tansforma la notacion infija a postfija y la segunda funcion evalúa la notación postfija y presenta el resultado. Tambien se adjuntan los archivos.h necesarios para implementar las colas y pilas genericas.

La carpeta Cola2Pilas contiene la cola creada a partir del uso de 2 pilas como máximo, además, presenta un archivo prueba.cpp donde se prueba el correcto funcionamiento de cada una de las implementaciones a evaluar, tales como: enqueue,dequeue, Front, IsEmpty.

La carpeta Vuelo cuenta con un archivo AeropuertoMain.cpp, que hace uso de los demás archivos.h que se encuentran en la carpeta. En AeropuertoMain.cpp se definen las funciones fuera del main ya que ahí corresponde la programación de los algoritmos que permiten la correcta planificación y ejecucion de los n vuelos en las k pistas. Dentro del Main solo se realizan 3 llamadas:

fillFlights(numero de aviones, hora de inicio, hora final): Esta funcion recibe un numero de vuelos a generar y un rango de horas que define entre cuales valores puede asignarse una hora de despegue a cada vuelo generado.

pistasAeropuerto(numero de pistas): Esta funcion permite modificar el número de pistas de despegue que tiene el aeropuerto.

despegar(): No recibe ningun dato por parámetro, unicamente se encarga de revisar el vuelo con mayor prioridad, o sea, el que tiene asignada la hora más próxima y realizar el despegue de este.