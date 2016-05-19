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
public abstract class Vehiculos_ {

    private String Placa;
    private String Marca;
    private String Modelo;
    private String Combustible;
    private Double Precio;
    public Vehiculos_() {
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

  
    
    public Vehiculos_(String Placa, String Marca, String Modelo, String Combustible, Double Precio) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Combustible = Combustible;
        this.Precio = Precio;
    }
 
}
