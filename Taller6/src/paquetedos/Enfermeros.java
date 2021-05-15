/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

/**
 *
 * @author Smart
 */
public class Enfermeros {
    private String nombre;
    private String tipoSa;
    private double sueldo;
    
    
    public Enfermeros (String nombres, String tiposas, double salarios){
        nombre = nombres;
        tipoSa = tiposas;
        sueldo = salarios;
    }

    public void establecerNombre(String nombres){
        nombre = nombres;        
    }
    
    public void establecerTipoNom(String tiposas){
        tipoSa = tiposas;        
    }
    
    public void establecerSueldo(double salarios){
        sueldo = salarios;        
    }

  
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerTipoNom() {
        return tipoSa;
    }
    
    public double obtenerSueldo() {
        return sueldo;
    }
     
    
}
