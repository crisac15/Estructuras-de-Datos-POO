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
protected:
    string nombre;
    int velocidadDeMov;
    int capacidadCarga;

public:
    Miner(){};
    virtual void setStrategy(string);
    int getVelocity()
    {
        return this->velocidadDeMov;
    }
    int getCapacity()
    {
        return this->capacidadCarga;
    }
};

class Explorer : public Miner
{
private:
    Strategy asignada;
    map<string, Strategy> estrategias;

public:
    Explorer()
    {

        this->nombre = "explorer";
        this->capacidadCarga = 8;
        this->velocidadDeMov = 20;
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
};

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
    // exp1.setStrategy("tryhard");
    // cout << "Nombre de estrategia asignada:  " << exp1.getStrategy().getNombreEstrategia() << endl;
    // cout << "Criterio para tuneles:  " << exp1.getStrategy().getCriterioTunel() << endl;
    // cout << "Criterio para puertas:  " << exp1.getStrategy().getCriterioPuerta() << endl;

    return 0;
}
