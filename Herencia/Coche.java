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
public class Coche extends Vehiculo //indicando la herencia
{
     private int Cilindrada;
     
     public Coche(Color color, int numSerie, int c) //Método constructor
    {
        super(color, numSerie);
        this.Cilindrada = c;
    }
     
     public int cilindrada()
    {
        return Cilindrada;
    }
    
     public void cambiaCilindrada(int c)
    {
        this.Cilindrada = c;
    } 
   
    @Override
    public String toString() {
               return super.toString() + ", cilindrada= " + Cilindrada;
  }
}
