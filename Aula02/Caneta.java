public class Caneta {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void status(){
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Uma caneta " + this.cor);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Carga: " + this.carga + " %");
    System.out.println("está tampada ? " + this.tampada);
  }
  void rabiscar() {
    if(this.tampada == true) {
      System.out.println("Erro ! Não posso rabiscar !");
    } else {
      System.out.println("Rabiscando");
    }
  }
  void tampar() {
    if(this.tampada == false){
      this.tampada = true;
    } else {
      System.out.println("A caneta já está tampada");
    }
  }
  void destampar() {
    if(this.tampada == true) {
      this.tampada = false;
    } else {
      System.out.println("A caneta já está destampada ");
    }
  }
}