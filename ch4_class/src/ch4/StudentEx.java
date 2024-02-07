package ch4;

public class StudentEx {

  public static void main(String[] args) {
    //객체(인스턴스) 생성
    Student student = new Student();
    System.out.println(student);
    print(student);
    // System.out.println(student); //ch4.Student@5ca881b5
    // System.out.println(student.id); //null
    // System.out.println(student.name); //null
    // System.out.println(student.addr); //null
    // System.out.println(student.hp); //null

    //생성된 인스턴스에 값 할당
    student.id = "20241212";
    student.name = "홍길동";
    student.addr = "서울시 종로구";
    student.hp = "010-1234-4567";
    print(student);

    Student student2 = new Student();
    student2.id = "20241013";
    student2.name = "성춘향";
    student2.addr = "서울시 종로구";
    student2.hp = "010-2345-5678";
    print(student2);
  }

  public static void print(Student student) {
    System.out.println(student.id);
    System.out.println(student.name);
    System.out.println(student.addr);
    System.out.println(student.hp);
  }
}
