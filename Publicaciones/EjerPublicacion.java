public class EjerPublicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Publicacion publicaciones [] = new Publicacion[10];
        int ctrlpub=0;
        
        Revista revista = new Revista();
        revista.setISSN("1234-5678");
        revista.setTitulo("Gavilanes");
        revista.setAutor("ITCG");
        revista.setNumero(1);
        revista.setPeriodicidad("mensual");
        revista.setPrecio(54.5);
      
        publicaciones[ctrlpub] = revista;
        ctrlpub++;
        
        Libro libro = new Libro();
        libro.setISBN("978-67-7645");
        libro.setTitulo("Python Machine Learning");
        libro.setAutor("Sebastian Raschka");
        libro.setEdicion("Segunda");
        libro.setPrecio(550);
        publicaciones[ctrlpub] = libro;
          ctrlpub++;
          
        for(int i=0; i<ctrlpub; i++)
        {
            if(publicaciones[i] instanceof Revista)
            {
               Revista rev = new Revista();
               rev = (Revista) publicaciones[i];//cast o conversiones implícitas y explícitas
               System.out.println("---REVISTA---");
               System.out.println("Titulo: " + rev.getTitulo());
           }
            else if (publicaciones[i] instanceof Libro)
            {
                Libro lib = new Libro();
                lib = (Libro)publicaciones[i];
                System.out.println("---LIBRO---");
                System.out.println("Titulo: " + lib.getTitulo());
            }
        }
    }
    
}
