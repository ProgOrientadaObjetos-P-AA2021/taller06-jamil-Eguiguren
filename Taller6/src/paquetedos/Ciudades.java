
package paquetedos;

public class Ciudades {
    private String nombre;
    private String provincia;
    
    
    public Ciudades (String nombres, String provincias){
        nombre = nombres;
        provincia = provincias;
    }

    
    
    public void establecerNombre(String nombre){
        nombre = nombre;        
    }
    
    public void establecerProvincia(String provincias){
        provincia = provincias;        
    }

  
    
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerProvincia() {
        return provincia;
    }
    
}
