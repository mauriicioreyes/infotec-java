public class Triangulo extends Figura {

    public Triangulo(Integer ancho, Integer alto) {
        super(ancho, alto);
    }

    @Override
    public double area() {
        return (getAncho() * getAlto())/2;
    }
}