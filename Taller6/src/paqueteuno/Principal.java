package paqueteuno;

import paquetedos.Hospitales;
import paquetedos.Ciudades;
import paquetedos.Enfermeros;
import paquetedos.Medicos;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreHospital;
        String direccion;
        int numEs;
        double sueldoT;
        String nombreEnfermero;
        String tipoEsE;
        double sueldoEnfermero;
        String nombreCiudad;
        String provincia;
        String nombreMedico;
        String tipoESM;
        double sueldoMedico;
        int numerM;
        int numerE;

        System.out.println("Ingrese el nombre del Hospital: ");
        nombreHospital = sc.nextLine();

        System.out.println("Ingrese la direccion del Hospital: ");
        direccion = sc.nextLine();

        System.out.println("Ingrese la nombre de la Ciudad: ");
        nombreCiudad = sc.nextLine();

        System.out.println("Ingrese la nombre de la Provincia: ");
        provincia = sc.nextLine();

        System.out.println("Ingrese el numero de especialidades: ");
        numEs = sc.nextInt();

        System.out.println("Ingrese el numero de Medicos: ");
        numerM = sc.nextInt();
        sc.nextLine();

        Medicos[] medico = new Medicos[numerM];

        for (int i = 0; i < numerM; i++) {

            System.out.println("Ingrese el nombre de los medicos: ");
            nombreMedico = sc.nextLine();

            System.out.println("Ingrese el tipo de especialidades de los Medicos: ");
            tipoESM = sc.nextLine();

            System.out.println("Ingrese el salario de los Medicos: ");
            sueldoMedico = sc.nextDouble();
            sc.nextLine();

            Medicos me = new Medicos(nombreMedico, tipoESM, sueldoMedico);

            medico[i] = me;
        }

        System.out.println("Ingrese el numero de Enfermeros: ");
        numerE = sc.nextInt();
        sc.nextLine();

        Enfermeros[] enfer = new Enfermeros[numerE];

        for (int i = 0; i < numerE; i++) {

            System.out.println("Ingrese el nombre de los Enfermeros: ");
            nombreEnfermero = sc.nextLine();

            System.out.println("Ingrese el tipo de especialidades de los Enfermeros: ");
            tipoEsE = sc.nextLine();

            System.out.println("Ingrese el salario de los Enfermeros: ");
            sueldoEnfermero = sc.nextDouble();
            sc.nextLine();

            Enfermeros enferme = new Enfermeros(nombreEnfermero, tipoEsE,
                    sueldoEnfermero);
            enfer[i] = enferme;

        }

        Ciudades ciudad = new Ciudades(nombreCiudad, provincia);

        Hospitales todos = new Hospitales(nombreHospital, direccion, ciudad,
                numEs, medico, enfer);
        
        todos.calcularSueldosTotales();
        
        System.out.printf("%s",todos);
    }

}
