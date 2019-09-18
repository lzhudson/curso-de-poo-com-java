class Caneta {
  public String modelo;
  private float ponta;
  private boolean tampada;
  private String cor;
  public Caneta(String modelo, String cor, float ponta){ // Metodo Construtor
    this.modelo = modelo;
    this.cor = cor;
    this.ponta = ponta;
    this.tampada = true;
  }
  public String getModelo() {
    return this.modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public float getPonta() {
    return this.ponta;
  }
  public void setPonta(float ponta) {
    this.ponta = ponta;
  }
  public void tampar() {
    this.tampada = true; 
  }
  public void destampar() {
    this.tampada = false; 
  }
  public String getCor(){
    return this.cor;
  }
  public void setCor(String cor){
    this.cor = cor;
  }
  
  public void status() {
    System.out.println("O modelo da caneta é: " + this.getModelo());
    System.out.println("A ponta da caneta é : " + this.getPonta());
     System.out.println("A cor da caneta é: " + this.cor);
    System.out.println("Tampada: " + this.tampada);
  }
 
}