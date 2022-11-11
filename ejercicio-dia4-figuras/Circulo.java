public class Circulo {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return (radio * Math.PI);
    }
}