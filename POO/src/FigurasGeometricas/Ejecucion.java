package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Introduce la cantidad de veces que desea jugar");
        int cant = lectura.nextInt();
        for (int i=0;i<cant;i++){

            System.out.println("De cual figura desea saber el area? 1 Rectangulo, 2 Circulo , 3 Triangulo");
            int numero = lectura.nextInt();
            switch (numero) {
                case 1:
                float altura;
                float base;
                System.out.println("cual es la altura de la figura");
                altura=lectura.nextFloat();
                System.out.println("cual es la base de la figura");
                base=lectura.nextFloat();
                Rectangulo Rc=new Rectangulo(altura,base);
                Rc.calcularArea();
                    break;
                case 2:
                    float radio;
                    System.out.println("cual es el radio del circulo");
                    radio=lectura.nextFloat();
                    circulo Cr=new circulo(radio);
                    Cr.calcularArea();
                    break;
                case 3:
                    float altura1;
                    float base1;
                    System.out.println("cual es la altura de la figura");
                    altura1=lectura.nextFloat();
                    System.out.println("cual es la base de la figura");
                    base1=lectura.nextFloat();
                    Triangulo Tr=new Triangulo(altura1,base1);
                    Tr.calcularArea();
                    break;
                
                default:
                    System.out.println("Numero Invalido");
                    break;
            }
            lectura.close();
        }
    }
}
