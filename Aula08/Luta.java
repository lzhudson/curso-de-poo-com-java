import java.util.Random;
class Luta {
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;

  public void marcarLuta(Lutador l1, Lutador l2){
    if((l1.getCategoria() == l2.getCategoria()) && l1 != l2){
      setAprovada(true);
      setDesafiado(l1);
      setDesafiante(l2);
      
    } else {
      setAprovada(false);
      setDesafiado(null);
      setDesafiante(null);
    }
  } 
  public void lutar(){
    if(getAprovada()){
      System.out.println("### Desafiado ###");
      desafiado.apresentar();
      System.out.println("### Desafiante ###");
      desafiante.apresentar();
      Random aleatorio = new Random(); 
      int vencedor = aleatorio.nextInt(3);
      switch(vencedor){
        case 0:
          System.out.println("Empatou !");
          this.desafiado.empatarLuta();
          this.desafiante.empatarLuta();
        break;
        case 1:
          System.out.println("Vitória do " + this.desafiado.getNome());
          this.desafiado.ganharLuta();
          this.desafiante.perderLuta();
        break;
        case 2:
          System.out.println("Vitória do " + this.desafiante.getNome());
          this.desafiante.ganharLuta();
          this.desafiado.perderLuta();
        break;
      }
    } else {
      System.out.println("A luta não pode acontecer !");
    }
  } 
  public void setDesafiado(Lutador desafiado){
    this.desafiado = desafiado;
  }
  public Lutador getDesafiado(){
    return this.desafiado;
  }
  public void setDesafiante(Lutador desafiante){
    this.desafiante = desafiante;
  }
  public Lutador getDesafiante(){
    return this.desafiante;
  }
  public int getRounds(){
    return this.rounds;
  }
  public void setRounds(int rounds){
    this.rounds = rounds;
  }
  public void setAprovada(boolean aprovada){
    this.aprovada = aprovada;
  }
  public boolean getAprovada(){
    return this.aprovada;
  }
}