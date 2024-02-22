package thread;

public class User2 extends Thread {

  private Calculator cal;

  public User2(Calculator cal) {
    this.cal = cal;
    super.setName("user 2");
  }

  @Override
  public void run() {
    cal.setMemory(50);
  }
}
