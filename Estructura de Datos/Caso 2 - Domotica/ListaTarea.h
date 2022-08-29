#include <conio.h>
#include <iostream>
using namespace std;
#include "Tarea.h"
#ifndef LISTATAREAS
#define LISTATAREAS
class LisTarea
{
private:
    typedef struct Nodo
    {
        Tarea *valor;
        Nodo *next;
    } * PtrNodo;
    PtrNodo first;
    PtrNodo curr;
    PtrNodo temp;
    friend class Tarea;

public:
    LisTarea()
    {
        first = NULL;
        curr = NULL;
        temp = NULL;
    }
    void addTarea(Tarea *pData)
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
    void removerTarea(Tarea *pRemove)
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
    void printLisTarea()
    {
        curr = first;
        while (curr != NULL)
        {
            cout << curr->valor << endl;
            curr = curr->next;
        }
    };
    void EjecutarTarea(string pTareaEjecutar)
    {
        curr = first;
        while (curr != NULL)
        {
            if (curr->valor->getNombreTar() == pTareaEjecutar)
            {
                curr->valor->ejecutar();
            };

            curr = curr->next;
        };
    }
};

#endif