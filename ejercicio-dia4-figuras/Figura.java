public abstract class Figura {
    private Integer coordenada_x;
    private Integer coordenada_y;
    private Integer ancho;
    private Integer alto;
    private double perimetro;
    private double area;

    public Figura (Integer ancho, Integer alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double area() {
        area = getAncho() * getAlto();
        return area;
    };

    public Integer getCoordenada_x() {
        return coordenada_x;
    }

    public void setCoordenada_x(Integer coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    public Integer getCoordenada_y() {
        return coordenada_y;
    }

    public void setCoordenada_y(Integer coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }   
}