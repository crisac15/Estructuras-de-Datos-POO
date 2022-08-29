#include <conio.h>
#include <iostream>
using namespace std;
#include "Dispositivo.h"
#ifndef LISTA
#define LISTA
class List
{
private:
    typedef struct Nodo
    {
        Dispositivo *valor;
        Nodo *next;
    } * PtrNodo;
    PtrNodo first;
    PtrNodo curr;
    PtrNodo temp;
    friend class Tarea;

public:
    List()
    {
        first = NULL;
        curr = NULL;
        temp = NULL;
    }
    void addNodo(Dispositivo *pData)
    {
        PtrNodo n = new Nodo;
        n->next = NULL;
        n->valor = pData;

        if (first != NULL)
        {
            curr = first;
            while (curr->next != NULL)
            {
                curr = curr->next;
            }
            curr->next = n;
        }
        else
        {
            first = n;
        }
    };
    void removerNodo(Dispositivo *pRemove)
    {
        PtrNodo PtrBorrar = NULL;
        temp = first;
        curr = first;
        while (curr != NULL && curr->valor != pRemove)
        {
            temp = curr;
            curr = curr->next;
        }
        if (curr == NULL)
        {
            cout << pRemove << "no esta en lista" << endl;
            delete PtrBorrar;
        }
        else
        {
            PtrBorrar = curr;
            curr = curr->next;
            temp->next = curr;
            if (PtrBorrar == first)
            {
                first = first->next;
                temp = NULL;
            }
            delete PtrBorrar;
            cout << "el valor" << pRemove << "fue borrado" << endl;
        }
    };
    void printList()
    {
        curr = first;
        while (curr != NULL)
        {
            cout << curr->valor << endl;
            curr = curr->next;
        }
    };
    void tipoEnLista()
    {
        curr = first;
        while (curr != NULL)
        {
            cout << curr->valor->getTipo();
            curr = curr->next;
        };
    };
    void printAction()
    {
        curr = first;
        while (curr != NULL)
        {
            cout << curr->valor->getAccion() << endl;
            curr = curr->next;
        };
    };
    void Ejecutar()
    {
        curr = first;
        while (curr != NULL)
        {
            cout << "El Dispositivo" << curr->valor->getNombre() << "ha ejecutado la accion" << curr->valor->getAccion() << " con los parametros" << curr->valor->getParam() << "en la habitacion numero " << curr->valor->getHabitacion() << endl;
            curr = curr->next;
        }
    }
};

#endif