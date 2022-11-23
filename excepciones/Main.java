import java.io.FileReader;

public class Main {
    public static void main(String[] ags) throws ExceptionCustom{

        // Excepciones

        // Excepción aritmética
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // Integer div = 1/0;

        // throw new ExceptionCustom("Error personalizado");
        
        // FileReader reader = new FileReader("ss");

        try {
            throw new ExceptionCustom("Error personalizado");

        } catch (ExceptionCustom e) {
            System.out.println("Excepción Custom");
        }

        try {
            Integer x = 1/0;

        } catch(IndexOutOfBoundsException e) {
            System.out.println("Excepción Index");
        } catch (ArithmeticException e) {
            System.out.println("Excepción Aritmética");
        } catch(Exception e) {
            System.out.println("Excepción genérica");
        } finally {
             System.out.println("Finally");
        }
    }
}

class ExceptionCustom extends Exception {
    public ExceptionCustom(String s) {
        super(s);
    }
}