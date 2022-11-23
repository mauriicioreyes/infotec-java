public class CuentaBancaria {
    private Double saldo;
    public static int totalCuentas = 0;
    
    public CuentaBancaria() {
        this(0.0);
    }

    public CuentaBancaria(Double ingreso) {
        saldo = ingreso;
        incCuentas();
    }

    // Métodos
    public void transferenciaSegura(CuentaBancaria origen) {
        if (this == origen) {
            return;
        } else {
            saldo += origen.saldo;
            origen.saldo = 0.0;
        }
    }

    public Double saldo() {
        return saldo;
    }

    public static void incCuentas() {
        totalCuentas++;
    }

    public void transferencia(CuentaBancaria origen) {
        saldo+= origen.saldo;
        origen.saldo = 0.0;
    }

}