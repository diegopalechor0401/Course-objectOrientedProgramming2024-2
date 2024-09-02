public class EjecutarCuentaBancaria {
    public static void main(String[] args) {
      CuentaBancaria objCuentaBancaria=new CuentaBancaria(67890, 0.0, "Diego Andres Palechor");    

      System.out.println("el saldo es : " + objCuentaBancaria.depositar(500.0));
      System.out.println("su saldo retirado es : "+objCuentaBancaria.retirar(150));
      System.out.println("su saldo total es : "+objCuentaBancaria.consultadesaldo(0)  );
    }
}
