
class TestReferenciaCliente {
  public static void main(String[] args){
    // Objeto Jose con datos:
    Cliente jose = new Cliente();
    jose.nombre = "Jose";
    jose.documento = "4455667788";
    jose.telefono = "111-2222-3333";

    // Objeto Cuenta de Jose:
    Cuenta cuentaDeJose = new Cuenta();
    cuentaDeJose.agencia = 1;
    cuentaDeJose.titular = jose; //Referencia (vincula a los 2 objetos)

    // Imprime del objeto cuentaDeJose, su atributo documento:
    System.out.println(cuentaDeJose.titular.documento);

    System.out.println(cuentaDeJose.titular);//Imprime la dir en memoria
    System.out.println(jose); //Imprime misma dir en memoria
  }
}