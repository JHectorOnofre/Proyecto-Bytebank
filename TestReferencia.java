class TestReferncia {
  public static void main(String[] args){

    // Se crean 2 instancias del objeto Cuenta
    Cuenta primeraCuenta = new Cuenta();
    primeraCuenta.saldo = 200;

    Cuenta segundaCuenta = primeraCuenta;
    segundaCuenta.saldo = 100;
/*
    System.out.println("Saldo de Primera Cuenta: "+ primeraCuenta.saldo);

    System.out.println("Saldo de Segunda Cuenta: "+ segundaCuenta.saldo);

    segundaCuenta.saldo += 400;
    System.out.println("Saldo de primera Cuenta: "+ primeraCuenta.saldo);
*/
    System.out.println(primeraCuenta.saldo);
  }
}