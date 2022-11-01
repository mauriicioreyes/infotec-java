public class convertirDatos {
	public static void main(String[] args) {
            // Conversión de tipos de datos primitivos
            // Conversión automática
            int varInt = 400;
            long varLong = varInt;
            float varFloat = varLong;

            System.out.println("varInt: " + varInt);
            System.out.println("varLong: " + varLong);
            System.out.println("varFloat: " + varFloat);

            // Conversión explícita = cuando el dato a convertir es más grande que el dato destino
            char varChar = 'z';
            int varInt2 = varChar;
            varChar = (char) varInt2;

            System.out.println("\nvarChar: " + varChar);
            System.out.println("varInt2: " + varInt2);


            double varDouble = 300.45;
            long varLong2 = (long) varDouble;
            int varInt3 = (int) varLong2;

            System.out.println("\nvarDouble: " + varDouble);
            System.out.println("varLong2: " + varLong2);
            System.out.println("varInt3: " + varInt3);

            // Promoción de expresiones
            // byte, short y char se promocionan a un int (entero)

            byte varByte = 100;
            byte varByte2 = 10;
            long datoLong = 200;
            float datoFloat = 300.14f;
            double datoDouble = 300.045;

            double operacion = varByte * varByte2 + datoLong + datoFloat + datoDouble;

            System.out.println("\noperacion: " + operacion);

            // Conversión explícita con las expresiones
            int operacion2 = (int) (varByte * varByte2 + datoLong);
            System.out.println("\noperacion2: " + operacion2);

	}
}
