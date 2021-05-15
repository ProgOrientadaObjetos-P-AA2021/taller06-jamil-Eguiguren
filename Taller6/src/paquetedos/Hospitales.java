package paquetedos;

public class Hospitales {

    private String nombreHospital;
    private String direccion;
    private Ciudades ciudad;
    private int numEs;
    private Medicos[] medico;
    private Enfermeros[] enfermero;
    private double sueldoT;

    public Hospitales(String nombrehosp, String direcciones, Ciudades ciudades,
            int numes, Medicos[] medicos, Enfermeros[] enfermeros) {
        nombreHospital = nombrehosp;
        direccion = direcciones;
        ciudad = ciudades;
        numEs = numes;
        medico = medicos;
        enfermero = enfermeros;
    }

    public void establecerNombreHospital(String nombrehosp) {
        nombreHospital = nombrehosp;
    }

    public void establecerDireccion(String direcciones) {
        direccion = direcciones;
    }

    public void establecerCiudad(Ciudades ciudades) {
        ciudad = ciudades;
    }

    public void establecerNumEs(int numes) {
        numEs = numes;
    }

    public void establecermedico(Medicos[] medicos) {
        medico = medicos;
    }

    public void establecerEnfermero(Enfermeros[] enfermeros) {
        enfermero = enfermeros;
    }

    public void calcularSueldosTotales() {
        double sueldoTotal = 0;
        for (Enfermeros obtenerEnfermero : obtenerEnfermeros()) {
            sueldoTotal = sueldoTotal + obtenerEnfermero.obtenerSueldo();
        }

        for (Medicos obtenermedico : obtenermedico()) {
            sueldoTotal = sueldoTotal + obtenermedico.obtenerSueldo();
        }
        sueldoT = sueldoTotal;
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public Ciudades obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumEs() {
        return numEs;
    }

    public Medicos[] obtenermedico() {
        return medico;
    }

    public Enfermeros[] obtenerEnfermeros() {
        return enfermero;
    }

    public double obtenerSueldoT() {
        return sueldoT;
    }
    
   @Override
   public String toString(){
       String cadena = "";
       cadena = String.format("%s%s\nDirección: %s\nCiudad: %s\nProvincia: %s\n"
               + "Número de especialidades: %d\nListado de médicos\n"
               ,cadena,nombreHospital,direccion,
               obtenerCiudad().obtenerNombre(),obtenerCiudad().obtenerProvincia()
               ,numEs);
        for (Medicos medico1 : medico) {
            cadena = String.format("%s-%s\n-%.2f\n-%s\n", cadena, 
                    medico1.obtenerNombre(), medico1.obtenerSueldo(), 
                    medico1.obtenerTipoNom());
        }  
       cadena = String.format("%sListado de enfermeros(as)\n",cadena); 
       
        for (Enfermeros enfermero1 : enfermero) {
            cadena = String.format("%s-%s\n-%.2f\n-%s\n", cadena,
                    enfermero1.obtenerNombre(), enfermero1.obtenerSueldo(), 
                    enfermero1.obtenerTipoNom());
        }
        
       cadena = String.format("%sTotal de sueldos a pagar por mes: %.2f"
               + "\n",cadena,sueldoT);  
       return cadena;
   }
   
}
