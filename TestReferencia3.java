
class TestReferencia3 {
  public static void main(String[] args) {
    Cuenta cuentaDeJose = new Cuenta();
    
    cuentaDeJose.titular = new Cliente(); // Se inicializa
    cuentaDeJose.titular.nombre = "Jose"; // Se le da un nombre
    
    System.out.println(cuentaDeJose.titular.nombre);
  }
}