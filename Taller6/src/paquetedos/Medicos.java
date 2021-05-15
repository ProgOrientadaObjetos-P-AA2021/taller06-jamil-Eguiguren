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
public class Medicos {
       
    private String nombre;
    private String tipoEs;
    private double sueldo;
    
    
    public Medicos (String nombres, String tipos, double salarios){
        nombre = nombres;
        tipoEs = tipos;
        sueldo = salarios;
    }

    public void establecerNombre(String nombres){
        nombre = nombres;        
    }
    
    public void establecerTipoNom(String tipos){
        tipoEs = tipos;        
    }
    
    public void establecerSueldo(double salarios){
        sueldo = salarios;        
    }

    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerTipoNom() {
        return tipoEs;
    }
    
    public double obtenerSueldo() {
        return sueldo;
    }
        
}
