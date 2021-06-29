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
public class Avion extends Vehiculo
{
    private double pesoton;
    
    
    public Avion(Color color, int numSerie, double peso) {
        super(color, numSerie);
        this.pesoton = peso;
    }
    
    public double pesoton()
    {
        return pesoton;
    }
    
     public void cambiapesoton(int c)
    {
        this.pesoton = c;
    }
     
     @Override
   public String toString() {
         return super.toString() + ", peso en toneladas = " + pesoton;
}
}
