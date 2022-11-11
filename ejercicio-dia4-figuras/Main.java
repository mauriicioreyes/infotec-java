public class Main {
    public static void main (String[] args) {
        Triangulo t1 = new Triangulo(10, 20);

        Rectangulo r1 = new Rectangulo(50, 10);

        Circulo c1 = new Circulo(30.5);

        System.out.println("\nÁrea Triángulo: " + t1.area());
        System.out.println("\nÁrea Rectángulo: " + r1.area());
        System.out.println("\nÁrea Círculo: " + c1.area());
    }
}