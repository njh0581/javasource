package exam;

import java.time.LocalDateTime;

public class Board {

  //번호, 제목, 내용, 작성자, 작성날짜, 수정날짜
  private int postNo;
  private String title;
  private String content;
  private String writer;
  private LocalDateTime regDate;
  private LocalDateTime lastModfedDate;

  public Board() {}

  public Board(int postNo, String title, String content, String writer) {
    this.postNo = postNo;
    this.title = title;
    this.content = content;
    this.writer = writer;
  }
}
