#include <conio.h>
#include <iostream>
using namespace std;
#include "Dispositivo.h"
#include "Lista.h"
#ifndef TAREA
#define TAREA

class Tarea
{
private:
    string nombreTarea;
    List *asignados = new List();

public:
    Tarea(string pNombre, List pLista)
    {
        this->nombreTarea = pNombre;
        pLista.curr = pLista.first;
        while (pLista.curr != NULL)
        {
            asignados->addNodo(pLista.curr->valor);
            pLista.curr = pLista.curr->next;
        };
        asignados->printList();
    }
    string getNombreTar()
    {
        return nombreTarea;
    }
    void ejecutar()
    {
        asignados->Ejecutar();
    }
    void configParametros()
    {
        asignados->curr = asignados->first;
        string actVar;
        string paramVar;
        while (asignados->curr != NULL)
        {
            cout << "Indique la accion y parametro para " << asignados->curr->valor->getNombre() << endl;
            cout << "Accion: " << endl;
            cin >> actVar;
            asignados->curr->valor->accion = actVar;
            cout << "Parametr: " << endl;
            cin >> paramVar;
            asignados->curr->valor->parametro = paramVar;
            asignados->curr = asignados->curr->next;
        };
    }
};

#endif