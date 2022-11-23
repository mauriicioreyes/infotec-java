public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        System.out.println("Total cuentas: " + CuentaBancaria.totalCuentas);
        CuentaBancaria c1;
        c1 = new CuentaBancaria(19.6);

        System.out.println("Nueva cuenta con: " + c1.saldo() + " euros");
        System.out.println("Total cuentas: " + CuentaBancaria.totalCuentas);
        
        CuentaBancaria c2 = new CuentaBancaria(29.3);
        
        System.out.println("Nueva cuenta con: " + c2.saldo() + " euros");
        System.out.println("Total cuentas: " + CuentaBancaria.totalCuentas);
        
        System.out.println("Transferencia de cuenta 2 a cuenta 1");

        c1.transferencia(c2);
        
        System.out.println("Cuenta 1 con: " + c1.saldo() + " euros");
        
        System.out.println("Cuenta 2 con: " + c2.saldo() + " euros");
        
        c2.transferenciaSegura(c2);

        System.out.println("Cuenta 1 con: " + c1.saldo() + " euros");
        
        System.out.println("Cuenta 2 con: " + c2.saldo() + " euros");
    }
}