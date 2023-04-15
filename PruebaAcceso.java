// Ejemplo de encapsulamiento: 

public class PruebaAcceso {
  
  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta();
    cuenta.depositar(400); //para poder hacer el retiro
    cuenta.retirar(300); 
    System.out.prinln(cuenta.getSaldo()); //obtiene saldo actual
  }
}