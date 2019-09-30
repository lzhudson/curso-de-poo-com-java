import java.util.Scanner;
class Conta {
  Scanner teclado = new Scanner(System.in);
  public int numConta;
  protected String tipoConta;
  private String donoConta;
  private float saldoConta;
  private boolean status;

  void status() {
    System.out.println("Numero da conta: " + getNumConta());
    System.out.println("Tipo Conta: " + getTipoConta());
    System.out.println("Dono da Conta: " + getDonoConta());
    System.out.println("Saldo da conta: " + getSaldoConta());
    System.out.println("A conta está: " + getStatusConta());
  }
  Conta() {
    this.status = false;
    this.saldoConta = 0;
  }
  public int getNumConta() {
    return this.numConta;
  }
  public void setNumConta(int numConta){
    this.numConta = numConta;
  }
  public String getTipoConta() {
    return this.tipoConta;
  }
  public void setTipoConta(String tipoConta){
    this.tipoConta = tipoConta;
  }
  public String getDonoConta() {
    return this.donoConta;
  }
  public void setDonoConta(String donoConta){
    this.donoConta = donoConta;
  }
  public float getSaldoConta() {
    return this.saldoConta;
  }
  public void setSaldoConta(float saldoConta){
    this.saldoConta = saldoConta;
  }
  public boolean getStatusConta() {
    return this.status;
  }
  public void setSatusConta(boolean statusConta){
    this.status = statusConta;
  }
  public void abrirConta(String tipoConta) {
    if(getStatusConta() == true) {
      System.out.println("Conta já está aberta !");
    } else {
      setSatusConta(true);
      if(tipoConta == "cc"){
        setTipoConta(tipoConta);
        setSaldoConta(50);
        } 
      else if(tipoConta == "cp") {
        setTipoConta(tipoConta);
        setSaldoConta(150);         
        }
      }
    }
  public void fecharConta() {
    if(getStatusConta() == true) {
      if(getSaldoConta() == 0) {
        setSatusConta(false);
        System.out.println("Sua Conta foi fechada");
      } else {
        System.out.println("Sua conta está ativa e não podemos fecha-la pois há saldo ou debito na conta !");
      }
    } else {
      System.out.println("Sua conta já esta fechada");
    }
  }
  public void deposistar(float valorDeposito) {
    if(getStatusConta() == true) {
      setSaldoConta(getSaldoConta() + valorDeposito);
    } else {
      System.out.println("Não podemos realizar o deposito pois a conta está fechada");
    }
  }
  public void sacar(float valorSaque) {
    if(getStatusConta() == true){
      if(valorSaque > getSaldoConta()) {
        System.out.println("Valor do saque é maior do que o disponivel !");
      } else {
        setSaldoConta(getSaldoConta() - valorSaque);
        System.out.println("Você sacou" + valorSaque);
      }
    }
  }
  public void pagarMensalidade() {
      float valorMensalidade;
      if(getStatusConta() == true) {
        if(getTipoConta() == "cc") {
          valorMensalidade = 12;
          if(getSaldoConta() < valorMensalidade) {
            System.out.println("Impossivel Pagar");
          } else {
            setSaldoConta(getSaldoConta() - valorMensalidade);
          }
        } else if(getTipoConta() == "cp") {
          valorMensalidade = 20;
          if(getSaldoConta() < valorMensalidade) {
            System.out.println("Impossivel Pagar");
          } else {
            setSaldoConta(getSaldoConta() - valorMensalidade);
          }
        } 
      } else {
        System.out.println("A conta está fechada");
      }
     
    }
}
