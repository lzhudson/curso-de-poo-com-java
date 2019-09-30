class Main {
  public static void main(String[] args) {
    Conta conta1 = new Conta();
    conta1.abrirConta("cc");
    conta1.setDonoConta("Hudson Holanda");
    conta1.setNumConta(22102000);
    conta1.status();
  }
}