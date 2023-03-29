package Salud;

public class Empleado extends Persona {
    public String cargo;
    public Double valorHora;
    public  Double horasTrabajadas;
    public String departamento;

    public Empleado(String tipoDoc, int documento, String nombre, String apellido, String cargo,Double valorHora, Double horasTrabajadas, String departamento){
        super(tipoDoc,documento,nombre,apellido);
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamento=departamento;
    }
    
    public double calcularHonorarios() {
        double total = valorHora * horasTrabajadas;
        double reteica = total * 0.00966;
        return total - reteica;
    }
    public void imprimirDetalles() {
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombres: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Cargo: " + cargo);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Total a pagar: " + calcularHonorarios());
    }
} 