/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_Abstract_Interfaz;

/**
 *
 * @author kleber
 */
public class Transportes_ extends Vehiculos_ implements Igiro_ ,Iretroceso{

    public Transportes_() {
    }

    public Transportes_(String Placa, String Marca, String Modelo, String Combustible, Double Precio) {
        super(Placa, Marca, Modelo, Combustible, Precio);
    }
        
    private float Capacidad_Carga=0;

    public float getCapacidad_Carga() {
        return Capacidad_Carga;
    }

    public void setCapacidad_Carga(float Capacidad_Carga) {
        this.Capacidad_Carga = Capacidad_Carga;
    }
  @Override
    public void Derecha(){
        System.out.println("a la derecha....camion...");
    }
    @Override
    public void Retro(){
        System.out.println("Retrocediendo camion................");
    }
}
