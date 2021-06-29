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
public class Vehiculo {
    public static enum Color {ROJO, VERDE, AZUL}
    private Color color;
    private final int numSerie; 
     
    public Vehiculo(Color color, int numSerie) //Método constructor
    {
        this.color=color;
        this.numSerie=numSerie;
    }
    
    public Color color()
    {
        return color;
    }
    
    public int numSerie()
    {
        return numSerie;
    }
    
    public void pinta (Color c)
    {
        color = c;
    }
   
    @Override //indica que se va a sobrescribir el método
    public String toString() {
    return "Vehículo -> numSerie= " + numSerie + ", color= " + color;
   }
}
