#include "Flight.h"
#include "ListG.h"
#include "cstdlib"
// debe llenar una lista de pCantidad vuelos aleatorios cuya hora y minutos de partida esten entre pStartHour y pEndHour
// tomando en cuenta las restricciones de los minutos de salida segun el ejercicio 3 del caso #3
List<Flight> listaVuelos = List<Flight>();

void fillFlights(int pCantidad, int pStartHour, int pEndHour)
{
    for (int i = 0; i < pCantidad; i++)
    {
        int hora = pStartHour + rand() % (pEndHour + 1 - pStartHour);
        int minuto = rand() % (42);
        cout << "vuelo  " << i << endl;
        cout << "hora  " << hora << endl;
        cout << "min  " << minuto << endl;
        int atraso = rand() % (17);
        minuto += atraso;
        Flight *vuelo = new Flight(hora, minuto);
        listaVuelos.addAtBegining(vuelo);
    }
}

int main()
{
    // genero dos vuelos entre las 3 y las 12 horas
    fillFlights(2, 3, 12);
    // valores solicitados del primer vuelo generado
    cout << "Hora y minutos generados tomando en cuenta posible atraso de 0 a 17 min de Vuelo 1----->  ";
    listaVuelos.find(0)->flightTimeString();
    // cout << listaVuelos.find(0) << endl;
    // cout << listaVuelos.find(1) << endl;
    cout << "La hora expresada de forma entera del primer vuelo es:  " << listaVuelos.find(0)->getIntTimeValue() << endl;
    cout << "Hora y minutos generados tomando en cuenta posible atraso de 0 a 17 min de Vuelo 2----->  ";
    listaVuelos.find(1)->flightTimeString();
    cout << "La hora expresada de forma entera del vuelo 2 es:  " << listaVuelos.find(1)->getIntTimeValue() << endl;
}