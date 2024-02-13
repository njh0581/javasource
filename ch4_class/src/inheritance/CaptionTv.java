package inheritance;

public class CaptionTv extends Tv {

  // CaptionTv(){
  //   super();
  // }

  boolean caption;

  void displayCaption(String text) {
    //if(caption!=true) == if(!caption)

    //if(caption == true)
    if (caption) {
      System.out.println(text);
    }
  }

  public CaptionTv(boolean caption) {
    this.caption = caption;
  }

  public CaptionTv(boolean power, int channel, boolean caption) {
    super(power, channel);
    this.caption = caption;
  }
}
