#include <iostream>
#include <string>
#include <map>
using namespace std;

class Strategy
{
private:
    string estrategia;
    string criterioPuer;
    string criterioTunel;

public:
    Strategy(){

    };
    Strategy(string pNombre, string pCritPuertas, string pCritTuneles)
    {
        this->criterioPuer = pCritPuertas;
        this->criterioTunel = pCritTuneles;
        this->estrategia = pNombre;
    }
    string getNombreEstrategia()
    {
        return estrategia;
    }
    string getCriterioPuerta()
    {
        return criterioPuer;
    }
    string getCriterioTunel()
    {
        return criterioTunel;
    }
};
class Miner
{
private:
    string nombre;

public:
    Miner();
    virtual void setName();
    virtual void setStrategy();
};

class Explorer : public Miner
{
private:
    string nombre;
    int velocidadDeMov = 20;
    int capacidadCarga = 20;
    Strategy asignada;
    map<string, Strategy> estrategias;

public:
    Explorer()
    {
        Strategy ejemplo = Strategy("tryhard", "escoje la primer puerta con tunel", "camina hacia la mitad del tunel para garantizar cantidad/tiempo");
        Strategy ejemplo2 = Strategy("analisis", "busca la puerta con tunel mas grande", "viaja hasta el final del tunel para minar");
        this->estrategias["tryhard"] = ejemplo;
        this->estrategias["analitico"] = ejemplo2;
    }
    void setStrategy(string pStrategy)
    {
        this->asignada = estrategias[pStrategy];
    }
    Strategy getStrategy()
    {
        return asignada;
    }
    void setName(string);
};
void Explorer::setName(string pName)
{
    Explorer::nombre = pName;
}

int main()
{
    map<string, string> mapExample;
    mapExample["uno"] = "manzana";
    mapExample["dos"] = "banano";
    mapExample["tres"] = "naranja";
    map<string, string>::iterator i;
    for (i = mapExample.begin(); i != mapExample.end(); i++)
    {
        cout << "llave: " << i->first << "  valor: " << i->second << endl;
    }

    Explorer exp1 = Explorer();
    exp1.setStrategy("tryhard");
    cout << "Nombre de estrategia asignada:  " << exp1.getStrategy().getNombreEstrategia() << endl;
    cout << "Criterio para tuneles:  " << exp1.getStrategy().getCriterioTunel() << endl;
    cout << "Criterio para puertas:  " << exp1.getStrategy().getCriterioPuerta() << endl;

    /*
    Some basic functions associated with Map:
    begin() – Returns an iterator to the first element in the map.
    end() – Returns an iterator to the theoretical element that follows the last element in the map.
    size() – Returns the number of elements in the map.
    max_size() – Returns the maximum number of elements that the map can hold.
    empty() – Returns whether the map is empty.
    pair insert(keyvalue, mapvalue) – Adds a new element to the map.
    erase(iterator position) – Removes the element at the position pointed by the iterator.
    erase(const g)– Removes the key-value ‘g’ from the map.
    clear() – Removes all the elemen
    */
    return 0;
}
