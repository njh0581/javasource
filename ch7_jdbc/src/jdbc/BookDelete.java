package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookDelete {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      Class.forName("oracle.jdbc.OracleDriver");

      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "c##test2";
      String password = "test";
      con = DriverManager.getConnection(url, user, password);
      String sql = "DELETE FROM BOOKTBL WHERE CODE=1004";
      //sql문 전송
      pstmt = con.prepareStatement(sql);
      int result = pstmt.executeUpdate();
      if (result > 0) {
        System.out.println("삭제 성공");
      } else {
        System.out.println("삭제 실패");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally { //자원 해제
      try {
        if (pstmt != null) {
          pstmt.close();
        }
        if (con != null) {
          con.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
