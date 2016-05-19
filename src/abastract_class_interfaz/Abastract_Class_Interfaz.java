/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abastract_class_interfaz;

import Modelo_Abstract_Interfaz.*;
import java.util.Scanner;
public class Abastract_Class_Interfaz {
// dentro de esto pongo mis metods y mis objetos 
    Automoviles_ Mazda;
    Transportes_ Mishubishi;
        public void Leer_Automoviles_()
    {
        Scanner ParaLeer = new Scanner (System.in);
        Mazda=new Automoviles_(); 
        System.out.println("Placa:");
        Mazda.setPlaca(ParaLeer.nextLine());
        System.out.println("Marca:");
        Mazda.setMarca(ParaLeer.next());
        System.out.println("Modelo:");
        Mazda.setModelo(ParaLeer.next());
        System.out.println("Combustible:");
        Mazda.setCombustible(ParaLeer.next());
        System.out.println("Precio:");
        Mazda.setPrecio(ParaLeer.nextDouble());
        System.out.println("Numero Pertas:");
        Mazda.setNumPuertas(ParaLeer.nextInt());
        System.out.println("Cilindraje:");
        Mazda.setCilindraje(ParaLeer.nextFloat());
    }
    
    public void Mostrar_Automovil()
    {
        System.out.println("Placa: "+ Mazda.getPlaca());
        System.out.println("Marca: "+ Mazda.getMarca());
        System.out.println("Modelo: "+ Mazda.getModelo());
        System.out.println("Combustible: "+ Mazda.getCombustible());
        System.out.println("Precio: "+ Mazda.getPrecio ());
        System.out.println("Numero Puertas: "+ Mazda.getNumPuertas ());
        System.out.println("Cilindraje: "+ Mazda.getCilindraje ()); 
        Mazda.Derecha();
        Mazda.Retro();
    }
    
    public void Leer_Transportes()
    {
        Scanner ParaLeer = new Scanner (System.in);
        Mishubishi =new Transportes_(); 
        System.out.println("Placa:");
        Mishubishi.setPlaca(ParaLeer.next());
        System.out.println("Marca:");
        Mishubishi.setMarca(ParaLeer.next());
        System.out.println("Modelo:");
        Mishubishi.setModelo(ParaLeer.next());
        System.out.println("Combustible:");
        Mishubishi.setCombustible(ParaLeer.next());
        System.out.println("Precio:");
        Mishubishi.setPrecio(ParaLeer.nextDouble());
        System.out.println("Capacidad Carga:");
        Mishubishi.setCapacidad_Carga(ParaLeer.nextInt());
    }
    
     public void Mostrar_Pesados()
    {
        System.out.println("Placa: "+ Mishubishi.getPlaca());
        System.out.println("Marca: "+ Mishubishi.getMarca());
        System.out.println("Modelo: "+ Mishubishi.getModelo());
        System.out.println("Combustible: "+ Mishubishi.getCombustible());
        System.out.println("Precio: "+ Mishubishi.getPrecio ());
        System.out.println("Capacidad Carga: "+ Mishubishi.getCapacidad_Carga()); 
        Mishubishi.Derecha();
        Mishubishi.Retro();
    }
       
    public static void main(String[] args) {
        //por lo general las superclases siempres son abstractras que
        //quiero decir que solo intancio los objetos derivados de la misma 
        //las interfaces sn abstractas ais no ponga por defecto son abstract..
        
        Abastract_Class_Interfaz MiCarro=new Abastract_Class_Interfaz ();
        System.out.println("\t\t\t***ingrese los datos del automovil***");
        MiCarro.Leer_Automoviles_();
        System.out.println("\t\t\t***ingrese los datos camion***");
        MiCarro.Leer_Transportes();
        System.out.println("\t\t\t\t\t******");
        System.out.println("\t\t\t***los datos del automovil son : ***");
        MiCarro.Mostrar_Automovil();
        System.out.println("\t\t\t\t\t******");
        System.out.println("\t\t\t***los datos del camion  son : ***");
        MiCarro.Mostrar_Pesados();
    }
    
}
