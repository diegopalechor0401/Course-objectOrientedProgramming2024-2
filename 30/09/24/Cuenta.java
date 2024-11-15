public class Cuenta {
   
    private String NroCuenta;
    private String tipocuenta;
    private double saldo;
    
    public Cuenta(String nroCuenta, String tipocuenta, double saldo) {
        NroCuenta = nroCuenta;
        this.tipocuenta = tipocuenta;
        this.saldo = saldo;
    }

    public void setNroCuenta(String nroCuenta) {
        NroCuenta = nroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [NroCuenta=" + NroCuenta + ", tipocuenta=" + tipocuenta + ", saldo=" + saldo + "]";
    }



    
}
