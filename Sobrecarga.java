*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosobrecarga;

/**
 *
 * @author areli
 */
public class Sobrecarga {
    public void prueba()
    {
        System.out.println("Método sin argumentos...");
    }
    
     public void prueba(int x)
    {
        System.out.println("Método con un argumento ..." + x);
    }
     
      public void prueba(int x, int y)
    {
        System.out.println("Método con dos argumentos..." + x + "   y " + y);
    }
       public void prueba(int x, int y, int z)
    {
        System.out.println("Método con tres argumentos..." + x + "  y" + y + " z " + z);
    }
}
