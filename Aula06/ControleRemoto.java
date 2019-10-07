class ControleRemoto implements Controlador{
  // Atributos
  private int volume;
  private boolean ligado;
  private boolean tocando;

  // Construtor
  public ControleRemoto() {
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
  }
  private int getVolume(){
    return this.volume;
  }
  private void setVolume(int volume) {
    this.volume = volume;
  }
  private boolean getLigado(){
    return this.ligado;
  }
  private void setLigado(boolean ligado){
    this.ligado = ligado;
  }
  private boolean getTocando(){
    return this.tocando;
  }
  private void setTocando(boolean tocando) {
    this.tocando = tocando;
  }
  // Metodos abstratos
  @Override
  public void ligar() {
    setLigado(true);
  }
  @Override
  public void desligar(){
    setLigado(false);
  }
  public void abrirMenu() {
    System.out.println("Está ligado ? " + this.getLigado());
    System.out.println("Está tocando ? " + this.getTocando());
    System.out.println("Volume: " + this.getVolume());
    for(int i = 0; i <= this.getVolume(); i+= 10){
      System.out.println("|");
    }
  }
  public void fecharMenu() {
    System.out.println("Fechando menu...");
  }
  @Override 
  public void maisVolume(){
    if(this.getLigado()){
      this.setVolume(this.getVolume() + 5);
    } else {
      System.out.println("Impossivel aumentar o volume");
    }
  }
  @Override
  public void menosVolume(){
    if(this.getLigado()){
      this.setVolume(this.getVolume() - 5);
    }
  }
  @Override
  public void ligarMudo(){
    if(this.getLigado() && this.getVolume() > 0) {
      this.setVolume(0);
    }
  }
  @Override
  public void desligarMudo() {
    if(this.getLigado() && this.getVolume() == 0){
      this.setVolume(0);
    }
  }
  @Override
  public void play(){
    if(this.getLigado() && !this.getTocando()){
      this.setTocando(true);
    } else {
      System.out.println("Não consegui reproduzir");
    }
  }
  @Override
  public void pause() {
    if(this.getLigado() && this.getTocando()){
      this.setTocando(false);
    } else {
      System.out.println("Não consegui pausar");
  }
  } 
}