public class cadena {
    public static void main (String [] args) {
        double variableDouble = 15.48;
        int i = 1;
        String cadena1, cadena2;

        cadena1 = Double.toString(variableDouble);
        cadena2 = Integer.toString(i);

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);

        System.out.println("Resultado 1: Aquí se realiza una concatenación de (" + cadena1 + " + 1) con resultado: " + (cadena1 + 1));

        System.out.println("Resultado 2: Aquí se realiza una concatenación de (1 + " + cadena1 + ") con resultado: " + 1 + cadena1);

        System.out.println("Resultado 3: Aquí se realiza una concatenación de (cadena1 + cadena2) con resultado: " + cadena1 + cadena2);
        
        System.out.println("Resultado 3: Aquí se realiza una concatenación de (cadena2 + cadena1) con resultado: " + cadena2 + cadena1);
    }
}