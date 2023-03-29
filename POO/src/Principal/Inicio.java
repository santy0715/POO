package Principal;
//import java.util.Scanner;

import Salud.Persona;
//import Salud.Empleado;
public class Inicio {
    public static void main(String[] args) {
        Persona persona = new Persona(null, 0, null, null);
        persona.registroPerson();
        persona.mostrarPersona();
        String imc= persona.calcularImc();
        persona.mayorEdad();
        if (imc.equals("PESOBAJO")) {
            System.out.println("El peso está por debajo de lo ideal.");
        } else if (imc.equals("PESOIDEAL")) {
            System.out.println("El peso es ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }
        
        /*String tipoDoc;
        int documento;
        String nombre;
        String apellido;
        String cargo;
        Double valorHora;
        Double horasTrabajadas;
        String departamento;
        Scanner lectura=new Scanner(System.in);
            System.out.println("Tipo de documento");
            tipoDoc=lectura.next();
            System.out.println("Numero de documento");
            documento=lectura.nextInt();
            System.out.println("Nombre");
            nombre=lectura.next();
            System.out.println("Apelllido");
            apellido=lectura.next();
            System.out.println("Cual es su cargo");
            cargo=lectura.next();
            System.out.println("A como cobra la hora");
            valorHora=lectura.nextDouble();
            System.out.println("Cuantas horas trabajo");
            horasTrabajadas=lectura.nextDouble();
            System.out.println("Cual es su departamento");
            departamento=lectura.next();
        Empleado emplead = new Empleado(tipoDoc, documento,nombre,apellido, cargo,valorHora,horasTrabajadas,departamento);
        emplead.calcularHonorarios();
        emplead.imprimirDetalles();
        lectura.close();*/
    }
}
