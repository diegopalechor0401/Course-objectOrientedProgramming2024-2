public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria(int numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public double depositar(double cantidad) {
        saldo += cantidad;
        return saldo;
    }
    public double retirar(double cantidad) {
        saldo += cantidad;
        return saldo;
    }
    public double consultadesaldo(double cantidad) {
        saldo = saldo;
        return saldo;
    }
}