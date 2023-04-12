// Main
public class PruebaMetodos {
  public static void main(Strings[] args) {

    // Instancia Cuenta 
    Cuenta miCuenta = new Cuenta();
    miCuenta.saldo = 300;

    // Método depositar pertenece al objeto cuenta
    miCuenta.depositar(200); // Se depositan 200 extra
    System.out.println(miCuenta.saldo);

    // Método retirar
    miCuenta.retirar(100); // Se retiran 100
    System.out.println(miCuenta.saldo);

    // Se define una Segunda Cuenta para las interacciones:
    Cuenta cuentaDeVale = new Cuenta();
    cuentaDeVale.depositar(1000);
    boolean puedeTransferir = cuentaDeVale.transferir(400, miCuenta);
    
    if (puedeTransferir) {
      System.out.println("Transferencia exitosa");
    } else {
      System.out.println("No es posible");
    }
    
    // Solo para comprobar cuanto $ le queda despues de trasferir
    System.out.println(cuentaDeVale.saldo); 
    System.out.println(miCuenta.saldo); //comprobacion 2
  }
}