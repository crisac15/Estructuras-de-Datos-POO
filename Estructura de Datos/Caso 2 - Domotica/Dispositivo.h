#include <conio.h>
#include <iostream>
using namespace std;

#ifndef DISPOSITIVO
#define DISPOSITIVO

struct Action
{
    string nombre;
    string parametro;
};
class Dispositivo
{
private:
    string tipo;
    string nombre;
    int habitacion;
    string accion;
    string parametro;
    friend class Tarea;

public:
    Dispositivo(string pTipo, string pNombre, int pHabitacion)
    {
        this->tipo = pTipo;
        this->nombre = pNombre;
        this->habitacion = pHabitacion;
    }

    string getTipo()
    {
        return tipo;
    }

    string getNombre()
    {
        return nombre;
    }
    int getHabitacion()
    {
        return habitacion;
    }
    string getAccion()
    {
        return accion;
    };
    string getParam()
    {
        return parametro;
    };
};

#endif