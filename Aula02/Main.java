class Main {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.cor = "Azul";
    c1.ponta = 0.5f;
    c1.tampada = false;
    c1.modelo = "BIC";
    c1.carga = 80;
    c1.tampar();
    c1.status();
    c1.destampar();
    c1.status();
    c1.tampar();
    c1.rabiscar();

    Caneta c2 = new Caneta();
    c2.modelo = "Hostnet";
    c2.cor = "Preta";
    c2.destampar();
    c2.rabiscar();
    c2.status();
  }
}