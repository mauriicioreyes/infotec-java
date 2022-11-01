public class impExplicito {
    public static void main(String args[]) {
        byte varByte = 8;
        short varShort = varByte;
        int varInt = varShort;
        long varLong = varInt;
        double varDouble = varLong;
        
        float varFloat2 = 5.67f;
        byte varByte2 = (byte) varFloat2;
        char varChar = (char) varByte2;
        short varShort2 = (short) varChar;
        
        System.out.println("Conversiones Implícitas: ");
        System.out.println("varByte: " + varByte);
        System.out.println("Short: " + varShort);
        System.out.println("Long: " + varLong);
        System.out.println("Double: " + varDouble);

        System.out.println("\nConversiones Explícitas: ");
        System.out.println("Float: " + varFloat2);
        System.out.println("Byte: " + varByte2);
        System.out.println("Char: " + varChar);
        System.out.println("Short: " + varShort2);
        
    }
}
