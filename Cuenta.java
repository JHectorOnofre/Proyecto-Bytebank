class Cuenta {
  // Atributos:
  double saldo;
  int agencia;
  int numero;
  String titular;

  // Método para el atributo "saldo"
  public void depositar(double valor) {
    // saldo es atributo de Cuenta
    this.saldo += valor;
  }

  // Método que debe retornar un mensaje de éxito o error (boolean)
  public boolean retirar(double valor) {
    // Primero se evalua si se tiene $suficiente
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true; // si todo sale bien
    }
      return false; // si falla
  }

  // Método transferir con 2 parametros (cuanto y a quien)
  public boolean transferir (double valor, Cuenta destino) {
    if (this.saldo >= valor) {
      this.saldo = this.saldo - valor;
      destino.depositar(valor);
      return true; // si tiene exito
    } else {
      return false; // si falla
    }
  }
  
}