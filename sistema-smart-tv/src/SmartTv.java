public class SmartTv {
  boolean on = false;
  int chanel = 3;
  int volum = 25;

  public void switchCanal(int newChanel) {
    chanel = newChanel;
  }

  public void upChanel() {
    chanel++;
  }

  public void downChanel() {
    chanel++;
  }

  public void aumentarVolume() {
    volum++;
    System.out.println("Volume: " + volum);
  }

  public void diminuirVolume() {
    volum--;
    System.out.println("Volume: " + volum);
  }
  
  public void online() {
    on = true;
  }
  public void offline() {
    on = false;
  }
}
