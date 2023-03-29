//paquete salud
package Salud;

import java.util.Scanner;

//clase persona
public class Persona {
    //atributos..
    public String tipoDoc;
    public int documento;
    public  String nombre;
    public String apellido;
    public Double peso;
    public Double estatura;
    public int edad;
    public String sexo;
    public Persona(String tipoDoc2, int documento2, String nombre2, String apellido2) {
    }
    //GET
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getEstatura() {
        return estatura;
    }
    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //metodos
    public void registroPerson(){
            Scanner lectura=new Scanner(System.in);
            System.out.println("Tipo de documento");
            tipoDoc=lectura.next();
            System.out.println("Numero de documento");
            documento=lectura.nextInt();
            System.out.println("Nombre");
            nombre=lectura.next();
            System.out.println("Apelllido");
            apellido=lectura.next();
            System.out.println("Cuanto pesa");  
            peso=lectura.nextDouble();
            System.out.println("Cuanto mide");
            estatura=lectura.nextDouble();
            System.out.println("Edad");
            edad=lectura.nextInt();
            System.out.println("Cual es su sexo");
            sexo=lectura.next();
            lectura.close();
            }
               

            
            public void mostrarPersona() {
                System.out.println("Tipo de documento: " + tipoDoc);
                System.out.println("Número de documento: " + documento);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                System.out.println("Peso en kg: " + peso);
                System.out.println("Estatura en metros: " + estatura);
                System.out.println("Edad: " + edad);
                System.out.println("Sexo: " + sexo);
            }
            public void mayorEdad() {
                if (edad >= 18) {
                    System.out.println("Es mayor de edad.");
                } else {
                    System.out.println("Es menor de edad.");
                }
            }
            /*public void calcularImc() {
            Double imc=peso/(estatura*estatura);
                if (imc<=20) {
                    System.out.println("el peso está por debajo de lo ideal");
                } else if (imc>=20&&imc<=25) {
                    System.out.println("peso ideal");
                } else {
                    System.out.println("sobrepeso");
                }*/
          
           
             public String calcularImc() {
            double imc=peso/(estatura*estatura);
            if (imc < 20) {
                return "PESOBAJO";
            } else if (imc >= 20 && imc <= 25) {
                return "PESOIDEAL";
            } else {
                return "SOBREPESO";
            }   
            } 
}
