package Interfaz;
import java.util.Random;
import java.util.Scanner;

public class Juego implements Game{
    
    
    private String nombre;
    private int jugadaJugador;
    private int jugadaComputadora;
    Scanner lectura=new Scanner(System.in);
    
    
    public void iniciar(){
        System.out.println("Ingrese su nombre");
        nombre = lectura.next();
    }
    public void jugar (){
        Random aleatorio= new Random();
        jugadaComputadora=aleatorio.nextInt(3)+1;
        System.out.print("Por favor, introduce tu jugada (0  Piedra, 1  Papel, 2 =Tijera) ");
        jugadaJugador = lectura.nextInt();
        String[] jugadas = {"Piedra", "Papel", "Tijera"};
        System.out.println(nombre + " ha jugado " + jugadas[jugadaJugador]);
        System.out.println("La computadora ha sacado " + jugadas[jugadaComputadora]);

    }
    
    public void finalizar(){
        
        if (jugadaJugador == jugadaComputadora) {
            System.out.println("¡Ha habido un empate!");
        } else if (jugadaJugador == 0 && jugadaComputadora == 2 || jugadaJugador == 1 && jugadaComputadora == 0 || jugadaJugador == 2 && jugadaComputadora == 1) {
            System.out.println(nombre + " has ganado ");
        } else {
            System.out.println(nombre + " has perdido ");
        }
    }
}

