#include <conio.h>
#include <iostream>
#include "Lista.h"
#include "ListaTarea.h"
#include "Dispositivo.h"
#include "Tarea.h"
using namespace std;

int main()
{
    //-------------------------------------------- CREAR DISP ---------------------------------------------------------
    Dispositivo *bombillo = new Dispositivo("Bombillo", "bombillo de la sala", 4);
    Dispositivo *CM = new Dispositivo("Coffee Maker", "CM de oficina", 1);
    //------------------------------------ GUARDAR DISP EN LISTA ------------------------------------------------------
    List *listaDisp = new List();
    listaDisp->addNodo(bombillo);
    listaDisp->addNodo(CM);
    //-------------------------------------------- CREAR TAREA --------------------------------------------------------
    Tarea *BuenosDias = new Tarea("buenosDias", *listaDisp);
    // BuenosDias->configParametros();
    //------------------------------------ CREAR LISTAS DE TAREAS ------------------------------------------------------
    LisTarea *lisTareas = new LisTarea();
    lisTareas->addTarea(BuenosDias);
    lisTareas->EjecutarTarea("buenosDias");
};