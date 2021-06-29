/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaherencia;

/**
 *
 * @author areli
 */
public class AplicaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //enum es una clase que está declarada en Vehiculo y que se declaró estática
        Vehiculo coche = new Coche(Vehiculo.Color.AZUL, 789456, 4);
        Vehiculo barco = new Barco(Vehiculo.Color.ROJO, 987410);
        Vehiculo nose;//Reserva el espacio en memoria
        nose = new Barco(Vehiculo.Color.VERDE, 6789); //Instancia el objeto
        Avion avion = new Avion(Vehiculo.Color.ROJO, 123654, 789456123);
        System.out.println(coche.toString());
        System.out.println(barco.toString());
        System.out.println(nose.toString());
        System.out.println(avion.toString());
    }
    
}
