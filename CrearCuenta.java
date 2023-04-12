class CrearCuenta {
  public static void main(String[] args) {
/* EJERCICIO #1
    // Cuenta tiene varios tipos de datos ()
    Cuenta primeraCuenta = new Cuenta();
    primeraCuenta.saldo = 1000;

    // Se crea una segunda Instancia:
    Cuenta segundaCuenta = new Cuenta();
    segundaCuenta.saldo = 550;

    System.out.println(primeraCuenta.saldo);
    System.out.println(segundaCuenta.saldo);
*/

// EJERCICIO #2:
    // Primera instancia
    Cuenta primeraCuenta = new Cuenta();
    primeraCuenta.saldo = 200;
    System.out.println(primeraCuenta.saldo);

    primeraCuenta.saldo += 100; // Ahora son 300
    System.out.println(primeraCuenta.saldo);

    // Segunda instancia
    Cuenta segundaCuenta = new Cuenta();
    segundaCuenta.saldo = 50;

    System.out.println("primera cuenta tiene" + primeraCuenta.saldo); // aun 300
    System.out.println("segunda cuenta tiene" + segundaCuenta.saldo); // Se cambia por su valor:50
  }
}
