package FigurasGeometricas;

public class circulo extends Figura{
private float radio;

    public circulo(float radio2) {
}

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("el area del circulo es de "+area);
    }
    
}
