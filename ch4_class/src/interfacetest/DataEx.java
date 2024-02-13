package interfacetest;

public class DataEx {

  public static void main(String[] args) {
    // DataAccessObject obj = new Oracle();
    // dbwork(obj);
    // obj = new MySql();
    // dbwork(obj);
    dbwork(new Oracle());
    dbwork(new MySql());

    //익명(anonymous) 클래스 : 일회용 클래스(선언과 생성 동시에)
    DataAccessObject object = new DataAccessObject() {
      @Override
      public void select() {
        System.out.println("PostgreSQL 검색");
      }

      @Override
      public void insert() {
        System.out.println("PostgreSQL 삽입");
      }

      @Override
      public void update() {
        System.out.println("PostgreSQL 수정");
      }

      @Override
      public void delete() {
        System.out.println("PostgreSQL 삭제");
      }
    };
    dbwork(object);
  }

  public static void dbwork(DataAccessObject dao) {
    dao.select(); //Oracle DB에서 검색 OR MySql DB에서 검색
    dao.insert(); //Oracle DB에서 삽입 OR MySql DB에서 삽입
    dao.update(); //Oracle DB에서 수정 OR MySql DB에서 수정
    dao.delete(); //Oracle DB에서 삭제 OR MySql DB에서 삭제
  }
}
