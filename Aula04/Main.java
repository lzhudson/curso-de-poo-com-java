class Main {
  public static void main(String[] args) {
    Caneta c1 = new Caneta("Bic", "Vermelho", 0.8f);
    c1.status();
    Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
    c2.status();
    //c1.setModelo("Bic Azul");
    // c1.modelo = "Bic";
    //c1.setPonta(0.5f);
    // c1.ponta = 0.5f;
    //c1.status();
    // System.out.println("O modelo da caneta é :" + c1.modelo);
    //System.out.println("O modelo da caneta é: " + c1.getModelo() + " de ponta " + c1.getPonta());
  }
}