package FigurasGeometricas;

public class Rectangulo extends Figura{

    private float altura; 
    private float base; 
    public Rectangulo (float altura,float base){
        this.altura=altura;
        this.base=base;
    }   
    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    public float getBase() {
        return base;
    }


    public void setBase(float base) {
        this.base = base;
    }


    public void calcularArea() {
    float area=0;
    area=base*altura;
    System.out.println("el area del rectangulo es "+area);
    }
    
}
