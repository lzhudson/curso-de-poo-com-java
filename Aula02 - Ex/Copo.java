class Copo {
  String cor;
  String modelo;
  int tamanho;
  boolean vazio;
  float quantidadeAgua;

  void status() {
    System.out.println("A cor do copo é: " + this.cor);
    System.out.println("O modelo do é copo é: " + this.modelo);
    System.out.println("O copo comporta cerca de " + this.tamanho + " ml");
    System.out.println("O copo está vazio ? " + this.vazio );
    System.out.println("O copo está com " + this.quantidadeAgua + " ml de água");
  }
  void encher() {
    if(this.vazio == true) {
      this.vazio = false;
    } else {
      System.out.println("O copo já está cheio");
    }
  }
  void esvaziar() {
    if(this.vazio == false) {
      this.vazio = true;
    } else {
      System.out.println("O copo já está vazio");
    }
  }
}