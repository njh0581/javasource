package book;

//--DTO(Data Transfer Object) : 클래스 간 데이터 교환
public class BookDTO {

  private int code;
  private String title;
  private String Writer;
  private int price;

  public BookDTO() {}

  public BookDTO(int code, String title, String writer, int price) {
    this.code = code;
    this.title = title;
    Writer = writer;
    this.price = price;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return Writer;
  }

  public void setWriter(String writer) {
    Writer = writer;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return (
      "BookDTO [code=" +
      code +
      ", title=" +
      title +
      ", Writer=" +
      Writer +
      ", price=" +
      price +
      "]"
    );
  }
}
