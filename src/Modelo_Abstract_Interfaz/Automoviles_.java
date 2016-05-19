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
public class Automoviles_ extends Vehiculos_ implements Igiro_ ,Iretroceso{

    public Automoviles_() {
    }

    public Automoviles_(String Placa, String Marca, String Modelo, String Combustible, Double Precio) {
        super(Placa, Marca, Modelo, Combustible, Precio);
    }
    private int NumPuertas=0;
    private float Cilindraje=0;

    public int getNumPuertas() {
        return NumPuertas;
    }

    public void setNumPuertas(int NumPuertas) {
        this.NumPuertas = NumPuertas;
    }

    public float getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(float Cilindraje) {
        this.Cilindraje = Cilindraje;
    }
      @Override
    public void Derecha(){
        System.out.println("a la derecha ........ auto");
    }
      @Override
    public void Retro(){
        System.out.println("retrocediendo................. auto");
    }
}
