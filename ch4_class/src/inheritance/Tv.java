package inheritance;

public class Tv {

  private boolean power;
  private int channel;

  public Tv() {}

  public Tv(boolean power, int channel) {
    this.power = power;
    this.channel = channel;
  }

  void power() {
    power = !power;
  }

  void channelUp() {
    channel++;
  }

  void channelDown() {
    channel--;
  }

  public boolean isPower() {
    return power;
  }

  public int getChannel() {
    return channel;
  }
}
